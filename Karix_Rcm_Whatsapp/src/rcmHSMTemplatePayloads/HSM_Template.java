package rcmHSMTemplatePayloads;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rcmUtility.BaseProperties;

public class HSM_Template extends BaseProperties {
	
	@Test
	public void send_hsm_template() throws IOException
	{	
		RestAssured.baseURI = getProperties("baseURI");    //Creating base URL for sending request
		RequestSpecification request = RestAssured.given();				// Initializing request for the given base URL
		request.header("Content-Type", getProperties("contentType"));			// Setting the header type
		request.header("Authentication", getProperties("authenticationKey"));	 // Setting the header type
		
		String requestBody = "{\r\n" + 
				"    \"message\": {\r\n" + 
				"        \"channel\": \"WABA\",\r\n" + 
				"        \"content\": {\r\n" + 
				"            \"preview_url\": true,\r\n" + 
				"            \"shorten_url\": false,\r\n" + 
				"            \"type\": \"TEMPLATE\",\r\n" + 
				"            \"template\": {\r\n" + 
				"                \"templateId\": \"2004\",\r\n" + 
				"                \"parameterValues\": {\r\n" + 
				"                    \"0\": \"अंकिता\",\r\n" + 
				"                    \"1\": \"weekly\",\r\n" + 
				"                    \"2\": \"123456\"\r\n" + 
				"                }\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        \"recipient\": {\r\n" + 
				"            \"to\": \"919940064660\",\r\n" + 
				"            \"recipient_type\": \"individual\",\r\n" + 
				"            \"reference\": {\r\n" + 
				"                \"cust_ref\": \"cust_ref123\",\r\n" + 
				"                \"messageTag1\": \"Message Tag 001\",\r\n" + 
				"                \"conversationId\": \"Conv_123\"\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        \"sender\": {\r\n" + 
				"            \"name\": \"Whatsappdemo\",\r\n" + 
				"            \"from\": \"918067329610\"\r\n" + 
				"        },\r\n" + 
				"        \"preferences\": {\r\n" + 
				"            \"webHookDNId\": \"1001\"\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"metaData\": {\r\n" + 
				"        \"version\": \"v1.0.9\"\r\n" + 
				"    }\r\n" + 
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