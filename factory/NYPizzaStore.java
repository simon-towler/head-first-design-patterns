public class NYPizzaStore extends PizzaStore {
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  public NYPizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza createPizza(String type) {
    return new Pizza();
  }
}
