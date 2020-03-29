public class ChicagoPizzaStore extends PizzaStore {
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  public ChicagoPizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza createPizza(String type) {
    return new Pizza();
  }
}
