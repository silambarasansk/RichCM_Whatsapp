package rcmLocationPayloads;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;
import rcmUtility.BaseProperties;

	public class Location_Message extends BaseProperties {		
		
		@Test
		public void send_location() throws IOException
		{	
			RestAssured.baseURI = getProperties("baseURI");    //Creating base URL for sending request
			RequestSpecification request = RestAssured.given();				// Initializing request for the given base URL
			request.header("Content-Type", getProperties("contentType"));			// Setting the header type
			request.header("Authentication", getProperties("authenticationKey"));	 // Setting the header type
			
			
			String requestBody = "{  \r\n" + 
					"   \"message\":{  \r\n" + 
					"      \"channel\":\"WABA\",\r\n" + 
					"      \"content\":{  \r\n" + 
					"         \"preview_url\":false,\r\n" + 
					"         \"shorten_url\":false,\r\n" + 
					"         \"type\":\"LOCATION\",\r\n" + 
					"         \"location\": {\r\n" + 
					"         \"longitude\": 77.6109,\r\n" + 
					"         \"latitude\":12.9379 ,\r\n" + 
					"         \"name\": \"KARIX MOBILE PRIVATE LIMITED\",\r\n" + 
					"         \"address\": \" 30, Hosur Main Road, 7th Block, Mavalli, Bengaluru, Karnataka 560095\"\r\n" + 
					"     }\r\n" + 
					"   },\r\n" + 
					"      \"recipient\":{  \r\n" + 
					"         \"to\":\"919940064660\",\r\n" + 
					"         \"recipient_type\":\"individual\",\r\n" + 
					"         \"reference\":{  \r\n" + 
					"            \"cust_ref\":\"cust_ref123\",\r\n" + 
					"            \"messageTag1\":\"Message Tag 001\",\r\n" + 
					"            \"messageTag2\":\"Message Tag 001\",\r\n" + 
					"            \"messageTag3\":\"Message Tag 001\",\r\n" + 
					"            \"messageTag4\":\"Message Tag 001\",\r\n" + 
					"            \"messageTag5\":\"Message Tag 001\",\r\n" + 
					"            \"conversationId\":\"Conv_123\"\r\n" + 
					"         }\r\n" + 
					"      },\r\n" + 
					"      \"sender\":{  \r\n" + 
					"         \"name\":\"whatsappdemo\",\r\n" + 
					"         \"from\":\"918067329610\"\r\n" + 
					"      },\r\n" + 
					"      \"preferences\":{  \r\n" + 
					"         \"webHookDNId\":\"1001\"\r\n" + 
					"      }\r\n" + 
					"   },\r\n" + 
					"   \"metaData\":{  \r\n" + 
					"      \"version\":\"v1.0.9\"\r\n" + 
					"   }\r\n" + 
					"}\r\n" + 
					"";
			
			request.body(requestBody.toString());				// Getting string body from the request body and passing into the request
			Response response = request.post("/sendMessage");	// Here sending the request & store the response values in the response variable
			JsonPath jsonPathEvaluator = response.jsonPath();	// Parsing JSON response using JsonPath
			String statusCode = jsonPathEvaluator.get("statusCode");			// Getting statusCode from response and stored in a String variable
			Assert.assertEquals(statusCode, "200");				// Doing assertion for the statuscode
			System.out.println("Received Response Code is:" +statusCode);
			String statusDesc = jsonPathEvaluator.get("statusDesc");	// Getting statusDesc from response and stored in a String variable
			Assert.assertEquals(statusDesc, "Successfully Accepted"); //Doing assertion for the status description
			System.out.println("Received Response Description is:" +statusDesc);
			String mid = jsonPathEvaluator.get("mid");		// Getting mid from response and stored in a String variable
			System.out.println("Received Response mid is:" +mid);
			
		}

	}


