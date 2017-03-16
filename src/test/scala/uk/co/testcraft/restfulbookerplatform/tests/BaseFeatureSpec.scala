package uk.co.testcraft.restfulbookerplatform.tests

import org.scalatest.{BeforeAndAfterAll, FeatureSpec, GivenWhenThen, Matchers}
import uk.co.testcraft.restfulbookerplatform.utils.ImplicitWebDriverSugar

trait BaseFeatureSpec extends FeatureSpec with BeforeAndAfterAll with GivenWhenThen with Matchers with ImplicitWebDriverSugar {

  override protected def afterAll(): Unit = {
    webDriver.quit()
  }

}
