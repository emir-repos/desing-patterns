public class TomatoSause extends ToppingDecorator {


  public TomatoSause(final Pizza newPizza) {
    super(newPizza);

    System.out.println("Adding Souse");

  }

  public String getDescription(){
    return tempPizza.getDescription() + ", Tomato Sauce";
  }

  public double getCost() {
    return tempPizza.getCost() + .35;
  }
}
