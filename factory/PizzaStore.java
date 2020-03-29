public abstract class PizzaStore {
  private static final String CLASS_NAME = "Abstract PizzaStore";
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  /*
  public PizzaStore() {
    this.factory = null;
    System.out.println(CLASS_NAME + ": No arg constructor was called. No factory passed in. Factory will be null.");
  }
*/
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  Pizza orderPizza(String type) {
    Pizza pizza;

if (null != factory) {
  pizza = factory.createPizza(type);
  } else {
    //TODO this is too far away in time and space from where the factory was initialized. Move it.
    //the factory was null
    System.out.println(CLASS_NAME + ": No factory to make pizza! Pizza will be null.");
    pizza = null;
  }

  if (null != pizza) {
    //A pizza returned from the factory knows how to do these things to itself
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  } else {
    System.out.println(CLASS_NAME + ": Factory gave us a null pizza!");
  }
    return pizza;
  }

  abstract Pizza createPizza(String type);

}
