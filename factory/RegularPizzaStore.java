public class RegularPizzaStore extends PizzaStore {
  public static final String CLASS_NAME = "RegularPizzaStore";

  public RegularPizzaStore(SimplePizzaFactory factory) {
    super.factory = factory;
  }

  public Pizza createPizza(String type) {
    return new Pizza();
  }
}
