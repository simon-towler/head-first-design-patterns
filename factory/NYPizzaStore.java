public class NYPizzaStore extends AbstractPizzaStore {
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  public NYPizzaStore(SimplePizzaFactory factory) {
    super.factory = factory;
  }

  public Pizza createPizza(String type) {
    return new Pizza();
  }
}
