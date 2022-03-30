abstract class ToppingDecorator implements Pizza {

  protected Pizza tempPizza; //it is accessible in the subclasses and in the classes of same package

  public  ToppingDecorator(Pizza newPizza) {
    tempPizza = newPizza;
  }

  public String getDescription(){
    return tempPizza.getDescription();
  }

  public double getCost() {
    return tempPizza.getCost();
  }
}
