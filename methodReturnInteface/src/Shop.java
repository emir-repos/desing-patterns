class SamsungS7 implements Phone {

  public void call() {
    System.out.println("calling");
  }

  public void sms() {
    System.out.println("sending");
  }

}


public class Shop {

  public Phone getPhone()
  {
    SamsungS7 s7 = new SamsungS7();
    return  s7;
  }



}
