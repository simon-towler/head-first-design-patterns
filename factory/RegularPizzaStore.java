public class RegularPizzaStore extends AbstractPizzaStore {
  public static final String CLASS_NAME = "RegularPizzaStore";

  public RegularPizzaStore(SimplePizzaFactory factory) {
    super.factory = factory;
  }

  public Pizza createPizza(String type) {
    return new Pizza();
  }
}
