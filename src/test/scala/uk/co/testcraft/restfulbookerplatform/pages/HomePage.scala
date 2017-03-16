package uk.co.testcraft.restfulbookerplatform.pages

import uk.co.testcraft.restfulbookerplatform.utils.Configuration

object HomePage extends RestfulBookerPage {

  override val url: String = Configuration.settings.url

  def openHomePage = go to url

  def clickOnLogin = click on linkText("Login")

  def logout = eventually { click on "logout" }



  def createHotel(name: String, address: String, owner: String, phone: String, email: String) = {
    textField("hotelName").value = name
    textField("address").value = address
    textField("owner").value = owner
    textField("address").value = phone
    textField("email").value = email
    click on "createHotel"
  }

}
