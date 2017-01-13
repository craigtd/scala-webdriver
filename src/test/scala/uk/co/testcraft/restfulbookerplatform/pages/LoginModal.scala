package uk.co.testcraft.restfulbookerplatform.pages

trait LoginModal extends WebPage {

  override val url: String = ""

  def username: TextField = textField("username")
  def password: PasswordField = pwdField("password")
  def loginButton: TextField = textField("doLogin")

}
