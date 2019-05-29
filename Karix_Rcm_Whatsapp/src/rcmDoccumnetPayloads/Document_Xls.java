package rcmDoccumnetPayloads;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rcmUtility.BaseProperties;

public class Document_Xls extends BaseProperties {

	@Test
	public void send_document_xls() throws IOException
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
			"            \"type\":\"document\",\r\n" + 
			"            \"caption\":\"XLS_File\",\r\n" + 
			"            \"mimeType\":\"document/xls\",\r\n" + 
			"            \"attachmentData\":\"0M8R4KGxGuEAAAAAAAAAAAAAAAAAAAAAPgADAP7/CQAGAAAAAAAAAAAAAAABAAAAMAAAAAAAAAAAEAAA/v///wAAAAD+////AAAAAC8AAAD///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////8JCBAAAAYFAFQ4zQfBwAEABgcAAOEAAgCwBMEAAgAAAOIAAABcAHAACwAAUmFqYXNla2FyIEsgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIEIAAgCwBGEBAgAAAMABAAA9AQIAAQCcAAIAEQAZAAIAAAASAAIAAAATAAIAAACvAQIAAAC8AQIAAAA9ABIAAAAAAApQSx44AAAAAAABAFgCQAACAAAAjQACAAAAIgACAAAADgACAAEAtwECAAAA2gACAAAAMQAeANwAAAAIAJABAAAAAgAABwFDAGEAbABpAGIAcgBpADEAHgDcAAAACACQAQAAAAIAAAcBQwBhAGwAaQBiAHIAaQAxAB4A3AAAAAgAkAEAAAACAAAHAUMAYQBsAGkAYgByAGkAMQAeANwAAAAIAJABAAAAAgAA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LQB9CAAAAAAAAAAAAAAAAAQAAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAAFAAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAABgAAAAIADQAUAAMAAAABAAAAMDBcKTtfKCoOAAUAAn0ILQB9CAAAAAAAAAAAAAAAAAcAAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAAIAAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAACQAAAAIADQAUAAMAAAABAAAAMDBcKTtfKCoOAAUAAn0ILQB9CAAAAAAAAAAAAAAAAAoAAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAALAAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAADAAAAAIADQAUAAMAAAABAAAAMDBcKTtfKCoOAAUAAn0ILQB9CAAAAAAAAAAAAAAAAA0AAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAAOAAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAADwAAAAIADQAUAAMAAAABAAAAMDBcKTtfKCoOAAUAAn0ILQB9CAAAAAAAAAAAAAAAACsAAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAAsAAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAALQAAAAIADQAUAAMAAAABAAAAMDBcKTtfKCoOAAUAAn0ILQB9CAAAAAAAAAAAAAAAAC4AAAACAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAJ9CC0AfQgAAAAAAAAAAAAAAAA6AAAAAgANABQAAwAAAAEAAAAwMFwpO18oKg4ABQACfQgtAH0IAAAAAAAAAAAAAAAAOwAAAAIADQAUAAMAAAADAAAAMDBcKTtfKCoOAAUAAX0IQQB9CAAAAAAAAAAAAAAAADEA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AAAAAAAAABEAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwBlZgUAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABcAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwDMTAUAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAAB0AAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAyMwUAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAACQAAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAAAAYAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABIAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwBlZgYAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABgAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwDMTAYAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAAB4AAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAyMwYAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAACUAAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAAAAcAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABMAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwBlZgcAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABkAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwDMTAcAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAAB8AAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAyMwcAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAACYAAAADAA0AFAADAAAAAAAAADAwXCk7XygqDgAFAAIEABQAAwAAAAgAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAAAAAAABQAAAADAA0AFAADAAAAAQAAADAwXCk7XygqDgAFAAIEABQAAwBlZggAAAA7XyhAXykgIH0IQQB9CAAAAAAAAAAA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AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD+/wAABgICAAAAAAAAAAAAAAAAAAAAAAABAAAAAtXN1ZwuGxCTlwgAKyz5rjAAAADEAAAACQAAAAEAAABQAAAADwAAAFgAAAAXAAAAZAAAAAsAAABsAAAAEAAAAHQAAAATAAAAfAAAABYAAACEAAAADQAAAIwAAAAMAAAAnwAAAAIAAADkBAAAHgAAAAQAAAAAAAAAAwAAAAAADwALAAAAAAAAAAsAAAAAAAAACwAAAAAAAAALAAAAAAAAAB4QAAABAAAABwAAAFNoZWV0MQAMEAAAAgAAAB4AAAALAAAAV29ya3NoZWV0cwADAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQAAAAIAAAADAAAABAAAAAUAAAAGAAAABwAAAAgAAAAJAAAACgAAAAsAAAAMAAAADQAAAA4AAAAPAAAAEAAAABEAAAASAAAAEwAAABQAAAAVAAAAFgAAABcAAAAYAAAAGQAAABoAAAAbAAAAHAAAAB0AAAAeAAAA/v///yAAAAAhAAAAIgAAACMAAAAkAAAAJQAAACYAAAD+////KAAAACkAAAAqAAAAKwAAACwAAAAtAAAALgAAAP7////9/////v////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////9SAG8AbwB0ACAARQBuAHQAcgB5AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFgAFAf//////////AgAAACAIAgAAAAAAwAAAAAAAAEYAAAAAAAAAAAAAAAAAAAAAAAAAAP7///8AAAAAAAAAAFcAbwByAGsAYgBvAG8AawAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASAAIB////////////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAg8AAAAAAAABQBTAHUAbQBtAGEAcgB5AEkAbgBmAG8AcgBtAGEAdABpAG8AbgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgAAgEBAAAAAwAAAP////8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAfAAAAABAAAAAAAAAFAEQAbwBjAHUAbQBlAG4AdABTAHUAbQBtAGEAcgB5AEkAbgBmAG8AcgBtAGEAdABpAG8AbgAAAAAAAAAAAAAAOAACAf///////////////wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACcAAAAAEAAAAAAAAA==\"\r\n" + 
			"            \r\n" + 
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
