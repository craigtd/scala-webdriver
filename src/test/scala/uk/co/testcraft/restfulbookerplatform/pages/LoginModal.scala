package uk.co.testcraft.restfulbookerplatform.pages

import org.scalatest.selenium.WebBrowser

object LoginModal extends WebBrowser with WebPage {

  override val url: String = ""

  def username: TextField = textField( "username" )
  def password: PasswordField = pwdField( "password" )

  def enterLoginDetails ( user:String, pwrd:String ) : Unit = {
    eventually {
      username.value = user
      password.value = pwrd
    }
  }

  def submitLoginDetails = click on "doLogin"

}
