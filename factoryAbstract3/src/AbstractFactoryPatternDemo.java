public class AbstractFactoryPatternDemo {

  public static void main(String[] args) {
    //get the shape factory
    //we don't need an object of FactoryProducer because method that we are calling is static
    AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
    //get an object of shape Rectangle
    Shape shape1 = shapeFactory1.getShape("RECTANGLE");
    shape1.draw();

    Shape shape2 = shapeFactory1.getShape("SQUARE");
    shape2.draw();

    AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

    Shape shape3 = shapeFactory2.getShape("RECTANGLE");
    shape3.draw();

    Shape shape4 = shapeFactory2.getShape("SQUARE");
    shape4.draw();
  }

}
