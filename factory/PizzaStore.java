public class PizzaStore {
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  Pizza orderPizza(String type) {
    Pizza pizza;

  pizza = factory.createPizza(type);

    pizza.prepare();
    pizz.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
//other methods here
}
