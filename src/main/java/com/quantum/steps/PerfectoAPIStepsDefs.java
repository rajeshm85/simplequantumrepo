package com.quantum.steps;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

//import com.qmetry.qaf.automation.step.QAFTestStep;
//import com.qmetry.qaf.automation.step.QAFTestStepProvider;
//import com.qmetry.qaf.automation.ui.WebDriverTestBase;
//import com.qmetry.qaf.automation.ws.rest.RestTestBase;
import com.qmetry.qaf.automation.ws.rest.RestWSTestCase;
import com.sun.jersey.api.client.ClientResponse.Status;

import gherkin.deps.com.google.gson.Gson;

//@QAFTestStepProvider
public class PerfectoAPIStepsDefs extends RestWSTestCase  {

//	@QAFTestStep(description="I send request for the users list")
//	public void ISendRequestForUsersList() {
//
//	}
//	
//	@QAFTestStep(description="I should see {0}")
//	public void IShouldSeeTheParamValue(String user) {
//		
//	}
	
	@Test(testName = "create order")
	public void createOrder() {

		//request data
		Map<String, String> data = new HashMap<String, String>();
		data.put("clientName", "Amit");
		data.put("amount", "100");
		
		//create post request
		getWebResource("/orders.json").post(new Gson().toJson(data));
		
		//verify response
		verifyThat("Response Status", getResponse().getStatus(), Matchers.equalTo(Status.CREATED));
	}
	
}
