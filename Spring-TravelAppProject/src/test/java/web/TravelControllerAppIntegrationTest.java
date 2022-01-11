package web;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.bae.travelapp.domain.Destination;

@ContextConfiguration
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:travel_app-schema.sql",
		"classpath:travel_app-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class TravelControllerAppIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

//	CREATE TEST
	@Test
	void testCreate() throws Exception {
		Destination testDestination = new Destination(null, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19);
		String testDestinationAsJson = this.mapper.writeValueAsString(testDestination);
		RequestBuilder req = post("/create").contentType(MediaType.APPLICATION_JSON).content(testDestinationAsJson);

		Destination testCreatedDestination = new Destination(1, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19);
		String testCreatedDestinationAsJson = this.mapper.writeValueAsString(testCreatedDestination);
		ResultMatcher checkStatus = status().isCreated();
		ResultMatcher checkBody = content().json(testCreatedDestinationAsJson);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

//	GET ALL TEST
	@Test
	void testGetAll() throws Exception {
		List<Destination> testDestinations = List.of(new Destination(1, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19));
		String json = this.mapper.writeValueAsString(testDestinations);

		RequestBuilder req = get("/getAll");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

//	GET BY ID TEST
	@Test
	void testGetById() throws Exception {
		Destination testDestinations = new Destination(2, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19);
		String json = this.mapper.writeValueAsString(testDestinations);

		RequestBuilder req = get("/get/1");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

//	GET BY CITY NAME
	@Test
	void testGetByCityName() throws Exception {
		List<Destination> testDestinations = List.of(new Destination(1, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19));
		String json = this.mapper.writeValueAsString(testDestinations);

		RequestBuilder req = get("/getByCityName/Barcelona");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);

	}

//	GET BY COUNTRY NAME 
	@Test
	void testGetByCountryName() throws Exception {
		List<Destination> testDestinations = List.of(new Destination(1, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19));
		String json = this.mapper.writeValueAsString(testDestinations);

		RequestBuilder req = get("/getByCountryName/Spain");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(json);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

//	UPDATE THE TEST
	@Test
	void testReplaceById() throws Exception {
		Destination testDestination = new Destination(1, "Barcelona", "Spain", "May", "La Sagrada Familia", 1.19);
		String json = this.mapper.writeValueAsString(testDestination);

		RequestBuilder req = put("/replace/1").contentType(MediaType.APPLICATION_JSON).content(json);
		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().json(json);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}

//	REMOVE THE TEST
	@Test
	void testRemoveById() throws Exception {
		RequestBuilder req = delete("/remove/1");
		ResultMatcher checkStatus = status().isNoContent();
		this.mvc.perform(req).andExpect(checkStatus);
	}

}
