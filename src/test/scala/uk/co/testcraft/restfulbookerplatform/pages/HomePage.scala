package uk.co.testcraft.restfulbookerplatform.pages

import uk.co.testcraft.restfulbookerplatform.utils.Configuration

object HomePage extends RestfulBookerPage {

  override val url: String = Configuration.settings.url

  def openHomePage = go to url

  def clickOnLogin = click on linkText("Login")

  def logout = eventually { click on "logout" }

}
