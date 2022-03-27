public class Factory  {

  public static void main(String[] args) {

    //OS obj = new Windows();  //v1 We want to hide object creation from the user

    OperatingSystemFactory osf = new OperatingSystemFactory();
    OS obj = osf.getInstance("Open");
    obj.spec();


  }

}
