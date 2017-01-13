package uk.co.testcraft.restfulbookerplatform.tests

import org.openqa.selenium.By
import uk.co.testcraft.restfulbookerplatform.flows.Login
import uk.co.testcraft.restfulbookerplatform.pages.HomePage

class RestfulBookerLoginSpec extends BaseFeatureSpec {

  feature("Create new hotel") {

    scenario("Login to hotel booker site") {

      Given("I am on the hotel management home page")
      HomePage.openHomePage

      When("I click on the Login link")
      HomePage.clickOnLogin
      Thread.sleep(1000)


      And("And I provide admin user credentials")
      Login.enterDetails("admin", "password")

      When("I click on the Login button")
      Login.clickLogin

      Then("I can access the hotel booking system")
      Thread.sleep(1000)

      //  def createHotelButton = driver.findElement(By.id("createHotel"))
//      assert(createHotelButton.isEnabled)

      Thread.sleep(3000)
      quit
    }

  }





}
