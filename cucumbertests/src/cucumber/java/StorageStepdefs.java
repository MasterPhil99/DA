import cucumber.api.Format;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StorageStepdefs {
    private StorageCalculator calc;

    @Given("^the filling is (.+)$")
    public void the_filling_is(int filling) { calc = new StorageCalculator(filling); }

    @When("^I withdraw (.+)$")
    public void i_withdraw(int amountWithdrawn) { calc.takeFilling(amountWithdrawn); }

    @Then("^the filling should be (.+)$")
    public void the_filling_should_be(int expectedAmount) { assertEquals(expectedAmount, calc.getCurrentAmount()); }
}
