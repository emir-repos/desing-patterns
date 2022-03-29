public class Bird extends Animal {

  public Bird() {
    //super();
    setSound("Tweet");

    flyingType = new ItFlys(); //it is going to set Fly interface polymorphic-ally
  }


}
