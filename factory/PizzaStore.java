Pizza orderPizza(String type) {
  Pizza pizza;

/*
 * Based on the type of pizza, we instantiate the appropriate concrete class
 * and assign it to the pizza instance variable.
 * Note that eah pizza has to implement the Pizza interface
*/
  if(type.equals("cheese")){
    pizza = new CheesePizza();
  } else if (type.equals("clam")) {
    pizza = new ClamPizza();
  } else if (type.equals("pepperoni")){
    pizza = new PepperoniPizza();
  } else if (type.equals("veggie")){
    pizza = new VeggiePizza();
  }//TODO check for unrecognised type

  pizza.prepare();
  pizz.bake();
  pizza.cut();
  pizza.box();
  return pizza;
}
