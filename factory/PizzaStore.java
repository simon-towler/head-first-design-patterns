public class PizzaStore {
  private static final String CLASS_NAME = "PizzaStore";
  SimplePizzaFactory factory;//will be passed in from constructor

  //constructor
  public PizzaStore() {
    this.factory = null;
  }

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  Pizza orderPizza(String type) {
    Pizza pizza;

if (null != factory) {
  pizza = factory.createPizza(type);
  } else {
    System.out.println(CLASS_NAME + ": No factory to make pizza!");
    pizza = null;
  }

  if (null != pizza) {
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
  } else {
    System.out.println(CLASS_NAME + ": Factory gave us a null pizza!");
  }
    return pizza;
  }
//other methods here
}
