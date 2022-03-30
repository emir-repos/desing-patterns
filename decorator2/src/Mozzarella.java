public class Mozzarella extends ToppingDecorator {


  public Mozzarella(final Pizza newPizza) {
    super(newPizza);  //super is reference for ToppingDecorator

    System.out.println("Adding Dough");

    System.out.println("Adding Mozzarella");
  }

  public String getDescription(){
    return tempPizza.getDescription() + ", Mozzarella";
  }

  public double getCost() {
    return tempPizza.getCost() + .50;
  }
}
