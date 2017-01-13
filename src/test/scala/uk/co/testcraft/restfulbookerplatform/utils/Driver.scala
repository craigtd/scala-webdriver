package uk.co.testcraft.restfulbookerplatform.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

object Driver {

  lazy val driver: WebDriver = new FirefoxDriver()

}
