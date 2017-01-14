package uk.co.testcraft.restfulbookerplatform.tests

import uk.co.testcraft.restfulbookerplatform.flows.Login
import uk.co.testcraft.restfulbookerplatform.pages.HomePage

class RestfulBookerLoginSpec extends BaseFeatureSpec {

  feature("Create new hotel") {

    scenario("Login to hotel booker site") {

      Given("I am on the hotel management home page")
      HomePage.openHomePage

      When("I click on the Login link")
      HomePage.clickOnLogin

      And("And I provide admin user credentials")
      Login.enterDetails("admin", "password")

      When("I click on the Login button")
      Login.clickLogin

      Then("I am logged into the hotel booking system and can log out again")
      HomePage.logout

      quit
    }

  }

}
