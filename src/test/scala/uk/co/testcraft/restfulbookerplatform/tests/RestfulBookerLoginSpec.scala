package uk.co.testcraft.restfulbookerplatform.tests

import uk.co.testcraft.restfulbookerplatform.flows.Login
import uk.co.testcraft.restfulbookerplatform.pages.HomePage
import uk.co.testcraft.restfulbookerplatform.tags.SmokeTest

class RestfulBookerLoginSpec extends BaseFeatureSpec {

  feature("Create new hotel") {

    scenario("Login to hotel booker site", SmokeTest) {

      Given("I am on the hotel management home page")
      HomePage.openHomePage

      When("I click on the Login link")
      HomePage.clickOnLogin

      And("And I provide admin user credentials")
      Login.enterDetails("admin", "password")

      When("I click on the Login button")
      Login.clickLogin

      // Only here to allow visual check on the tests - Chrome runs too quick. Plan to introduce means of setting the browser window visible
      Thread.sleep(10000)

      Then("I am logged into the hotel booking system and can log out again")
      HomePage.logout

      quit
    }

  }

}
