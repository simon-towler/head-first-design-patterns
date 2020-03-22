public class SimplePizzaFactory {

  //this is the method all clients will use to instantiate new objects
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")){
      pizza = new CheesePizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    } else if (type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    } else if (type.equals("veggie")){
      pizza = new VeggiePizza();
    }//TODO check for unrecognised type
  return pizza;
  }
}
