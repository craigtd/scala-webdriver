package uk.co.testcraft.restfulbookerplatform.utils

case class User ( username : String, password : String)

object User {

  val ADMIN_USER = User ( "admin" , "password" )
  val INVALID_USER = User ( "rookie" , "password" )
  val INVALID_PASSWORD = User ( "admin" , "passw0rd" )

}
