package uk.co.testcraft.restfulbookerplatform.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import uk.co.testcraft.restfulbookerplatform.utils.Configuration.settings

object SingletonDriver extends Driver

class Driver {

  private var instance: WebDriver = null

  def getInstance(): WebDriver = {
    if (instance == null) {
      initialiseBrowser()
    }
    instance
  }

  private def initialiseBrowser(){
    instance = createBrowser()
    instance.manage().window().maximize()
  }

  protected def createBrowser(): WebDriver = {

    def createChromeDriver: WebDriver = {
      val capabilities = DesiredCapabilities.chrome()
      new ChromeDriver(capabilities)
    }

    def createFirefoxDriver: WebDriver = {
      val capabilities = DesiredCapabilities.firefox()
      new FirefoxDriver(capabilities)
    }

    settings.BROWSER.toLowerCase match {
      case "firefox" => createFirefoxDriver
      case "chrome" => createChromeDriver
      case _ => throw new IllegalArgumentException(s"Browser type ${settings.BROWSER} not recognised")
    }

  }

}
