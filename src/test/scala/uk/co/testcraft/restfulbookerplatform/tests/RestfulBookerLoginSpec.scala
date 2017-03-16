package uk.co.testcraft.restfulbookerplatform.tests

import uk.co.testcraft.restfulbookerplatform.pages.{HomePage, LoginModal}
import uk.co.testcraft.restfulbookerplatform.tags.SmokeTest
import uk.co.testcraft.restfulbookerplatform.utils.TestUsers

class RestfulBookerLoginSpec extends BaseFeatureSpec {

  feature("Create new hotel") {

    scenario("Login to hotel booker site", SmokeTest) {

      Given("I am on the hotel management home page")
      HomePage.openHomePage

      When("I click on the Login link")
      HomePage.clickOnLogin

      And("And I provide admin user credentials")
      LoginModal.enterLoginDetails(TestUsers.ADMIN_USER)

      When("I click on the Login button")
      LoginModal.submitLoginDetails

      Then("I am logged into the hotel booking system and can log out again")
      HomePage.logout

    }


    scenario("Create a new hotel", SmokeTest) {
      Given("I am logged in to the hotel booker site")
      HomePage.openHomePage
      HomePage.clickOnLogin
      LoginModal.enterLoginDetails(TestUsers.ADMIN_USER)
      LoginModal.submitLoginDetails

      When("I create a new hotel")
      HomePage.createHotel("Hotel Bayonne", "123 Rue de la mer","Monsieur Canard", "+44123456789", "canard@gmail.com")

      Then("A new entry is created")
      HomePage.
    }

  }

}
