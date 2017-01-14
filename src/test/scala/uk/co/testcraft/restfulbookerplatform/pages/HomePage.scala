package uk.co.testcraft.restfulbookerplatform.pages

object HomePage extends RestfulBookerPage {

  override val url: String = "http://localhost:3003"

  def openHomePage = go to url

  def clickOnLogin = click on linkText("Login")

  def logout = eventually { click on "logout" }

}
