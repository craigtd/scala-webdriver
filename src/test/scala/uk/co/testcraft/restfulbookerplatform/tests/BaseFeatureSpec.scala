package uk.co.testcraft.restfulbookerplatform.tests

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}
import uk.co.testcraft.restfulbookerplatform.utils.ImplicitWebDriverSugar

trait BaseFeatureSpec extends FeatureSpec with GivenWhenThen with Matchers with ImplicitWebDriverSugar {

  def quit = webDriver.quit()

}
