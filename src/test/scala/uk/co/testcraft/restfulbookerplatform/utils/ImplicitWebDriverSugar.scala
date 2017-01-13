package uk.co.testcraft.restfulbookerplatform.utils

import org.openqa.selenium.WebDriver


trait ImplicitWebDriverSugar {

  implicit val webDriver: WebDriver = Driver.driver

}
