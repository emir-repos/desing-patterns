public class Sheep implements Animal {

  public Sheep() {
    System.out.println("Sheep is made");
  }

  @Override
  public Animal makeCopy() {
    System.out.println("Sheep is being made");
    Sheep sheepObject = null;
    try { //this exception is going to be cloned if object does not extend Cloneable
      sheepObject = (Sheep) super.clone();
    } catch(CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return sheepObject;
  }

  public String toString() {
    return "Dolly is my Hero, Baaaa";
  }
}
