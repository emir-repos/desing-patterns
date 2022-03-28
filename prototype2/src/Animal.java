public interface Animal extends Cloneable {
  //copy instances of this class in completely different locations in memory
  // it is copy ( not the reference)

  public Animal makeCopy();

}
