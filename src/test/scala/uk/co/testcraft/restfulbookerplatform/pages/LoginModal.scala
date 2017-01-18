package uk.co.testcraft.restfulbookerplatform.pages

import org.scalatest.selenium.WebBrowser
import uk.co.testcraft.restfulbookerplatform.utils.User

object LoginModal extends WebBrowser with WebPage {

  override val url: String = ""

  def username: TextField = textField( "username" )
  def password: PasswordField = pwdField( "password" )

  def enterLoginDetails ( user: User ) : Unit = {
    eventually {
      username.value = user.username
      password.value = user.password
    }
  }

  def submitLoginDetails = click on "doLogin"

}
