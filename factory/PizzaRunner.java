public class PizzaRunner {

  public static void main (String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(factory);
    pizzaStore.orderPizza("veggie");
  }

}
