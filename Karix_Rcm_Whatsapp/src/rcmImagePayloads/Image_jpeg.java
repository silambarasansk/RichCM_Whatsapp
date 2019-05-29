package rcmImagePayloads;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rcmUtility.BaseProperties;

public class Image_jpeg extends BaseProperties {
		
		@Test
		public void send_image_jpeg() throws IOException
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
					"         \"type\":\"ATTACHMENT\",\r\n" + 
					"         \"attachment\":{  \r\n" + 
					"            \"type\":\"image\",\r\n" + 
					"            \"caption\":\"JPEG_IMAGE\",\r\n" + 
					"            \"mimeType\":\"image/jpeg\",\r\n" + 
					"            \"attachmentData\":\"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\"\r\n" + 
					"         }\r\n" + 
					"      },\r\n" + 
					"      \"recipient\":{  \r\n" + 
					"         \"to\":\"919940064660\",\r\n" + 
					"         \"recipient_type\":\"individual\",\r\n" + 
					"         \"reference\":{  \r\n" + 
					"            \"cust_ref\":\"cust_ref123\",\r\n" + 
					"            \"messageTag1\":\"Message Tag 001\",\r\n" + 
					"            \"conversationId\":\"Conv_123\"\r\n" + 
					"         }\r\n" + 
					"      },\r\n" + 
					"      \"sender\":{  \r\n" + 
					"         \"name\":\"waba\",\r\n" + 
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
			int statusCode = response.getStatusCode();			// Getting statuscode from response and stored in a Integer variable
			Assert.assertEquals(statusCode, 200);				// Doing assertion for the statuscode
			System.out.println("Received Response Code is:" +statusCode);
			String statusDesc = response.jsonPath().getString("statusDesc");
			Assert.assertEquals(statusDesc, "Successfully Accepted"); //Doing assertion for the status description
			System.out.println("Received Response Description is:" +statusDesc);
		}
		}

	