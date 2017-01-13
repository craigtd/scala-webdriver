package uk.co.testcraft.restfulbookerplatform.pages

import org.scalatest.Assertions
import org.scalatest.concurrent.{Eventually, PatienceConfiguration}
import org.scalatest.selenium.WebBrowser
import org.scalatest.time.{Millis, Seconds, Span}
import uk.co.testcraft.restfulbookerplatform.utils.ImplicitWebDriverSugar

trait WebPage extends org.scalatest.selenium.Page with PatienceConfiguration with WebBrowser with Eventually with Assertions with ImplicitWebDriverSugar{

  override val url = ""

  override implicit val patienceConfig: PatienceConfig = PatienceConfig(timeout = scaled(Span(5, Seconds)), interval = scaled(Span(500, Millis)))

}
