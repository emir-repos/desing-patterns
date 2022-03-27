public class Singleton
{

  public static void main(String[] args) {
    Abc obj1 = Abc.getInstance();

    Abc obj2 = Abc.getInstance();
    // we are getting the same instance as in line 8

    //Abc obj2 = new Abc();

    System.out.println("obj1 = " + obj1.hashCode());
    System.out.println("obj2 = " + obj2.hashCode());
    //proof that we are always creating only one instance of the object
  }
}

class Abc {

  //1. creating static object at class time
  //The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.
  static Abc obj = new Abc();
  //static word means that we don't need the object


  //2. preventing calling the default constructor
  private Abc() {

  }

  //3. returning created object
  public static Abc getInstance() {
    return obj;
  }

}
