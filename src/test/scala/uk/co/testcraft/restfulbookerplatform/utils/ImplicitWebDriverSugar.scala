package uk.co.testcraft.restfulbookerplatform.utils

import org.openqa.selenium.WebDriver

trait ImplicitWebDriverSugar {

  implicit lazy val webDriver: WebDriver = SingletonDriver.getInstance()

}
