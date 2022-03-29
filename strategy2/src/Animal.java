public class Animal {

  private String name;
  private int weight;
  private String sound;

  public Flys flyingType; //composition

  public String getName() {
    return name;
  }

  public void setName(final String newName) {
    this.name = newName;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(final int newWeight) {
    if (newWeight > 0 ) {
      weight = newWeight;
    } else {
      System.out.println("Weight must be bigger than 0");
    }
    this.weight = newWeight;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(final String newSound) {
    this.sound = newSound;
  }

  public String tryToFly() {
    return flyingType.fly();
  }

  public void setFlyingAbility(Flys newFlyType) {
    flyingType = newFlyType;
  }

}
