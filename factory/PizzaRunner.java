public class PizzaRunner {
  private static final String CLASS_NAME = "PizzaRunner";

  public static void main (String[] args) {
    System.out.println(CLASS_NAME + " will order a veggie pizza.");
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(factory);
    pizzaStore.orderPizza("veggie");

    //order a New York style pizza
    System.out.println(CLASS_NAME + " will order a NY style veggie pizza.");
    NYPizzaFactory nyFactory = new NYPizzaFactory();
    PizzaStore nyStore = new PizzaStore(nyFactory);
    nyStore.orderPizza("veggie");

    //order a Chicago style pizza
    System.out.println(CLASS_NAME + " will order a Chicago style veggie pizza.");
    ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
    PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
    chicagoStore.orderPizza("veggie");
  }

}
