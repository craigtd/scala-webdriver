package uk.co.testcraft.restfulbookerplatform.flows

import org.openqa.selenium.WebDriver
import uk.co.testcraft.restfulbookerplatform.pages.{LoginModal, RestfulBookerPage}
import uk.co.testcraft.restfulbookerplatform.tests.BaseFeatureSpec

object Login extends BaseFeatureSpec with LoginModal {

  def enterDetails(user:String, pwrd:String) (implicit webDriver: WebDriver): Unit = {
    username.value = user
    password.value = pwrd

  }

  def clickLogin (implicit webDriver: WebDriver) = click on "doLogin"

}
