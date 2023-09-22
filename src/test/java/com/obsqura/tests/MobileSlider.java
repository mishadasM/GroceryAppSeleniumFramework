package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class MobileSlider extends BaseTest{
	
	@Test
	public void MYMobileSliderTest() throws IOException {
		
		
		lp.Login();		
		hp.NavigateToMobileSlider();
		ms.ClickNewBtn();
		ms.AddMobileSlider();
		String alertText=ms.ValidateMobileSliderCreated();
		if (alertText.contains("Alert!\n" 
				+ "Mobile Slider Created Successfully"))
			
				{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

	}

}