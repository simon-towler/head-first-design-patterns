public class PizzaRunner {
  private static final String CLASS_NAME = "PizzaRunner";

  public static void main (String[] args) {
    System.out.println(CLASS_NAME + " will get a new SimpleFactory.");
    SimplePizzaFactory factory = new SimplePizzaFactory();
    System.out.println(CLASS_NAME + " will get a new RegularPizzaStore, passing in the SimpleFactory.");
    PizzaStore pizzaStore = new RegularPizzaStore(factory);
    System.out.println(CLASS_NAME + " will order a veggie pizza from the RegularPizzaStore.");
    pizzaStore.orderPizza("veggie");

    //order a New York style pizza
    System.out.println(CLASS_NAME + " will order a NY style veggie pizza.");
    NYPizzaFactory nyFactory = new NYPizzaFactory();
    PizzaStore nyStore = new NYPizzaStore(nyFactory);
    nyStore.orderPizza("veggie");

    //order a Chicago style pizza
    System.out.println(CLASS_NAME + " will order a Chicago style veggie pizza.");
    ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
    PizzaStore chicagoStore = new ChicagoPizzaStore(chicagoFactory);
    chicagoStore.orderPizza("veggie");
  }

}
