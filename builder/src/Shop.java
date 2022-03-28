public class Shop {

  public static void main(String[] args) {

    //Phone p = new Phone("Android", 2, "QualCom", 5.5, 3100);
    //Here we have to keep in mind about sequence and
    //we can not leave out (omit) one value - ram for example

    Phone p = new PhoneBuilder()
      .setOs("Android")
        .setRam(2)
          .getPhone();

    System.out.println(p);
  }

}
