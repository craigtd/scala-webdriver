package uk.co.testcraft.restfulbookerplatform.flows

import uk.co.testcraft.restfulbookerplatform.pages.LoginModal
import uk.co.testcraft.restfulbookerplatform.tests.BaseFeatureSpec

object Login extends BaseFeatureSpec with LoginModal {

  def enterDetails(user:String, pwrd:String) : Unit = {
    eventually {
      username.value = user
      password.value = pwrd
    }
  }

  def clickLogin = click on "doLogin"

}
