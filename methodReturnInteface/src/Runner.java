public class Runner {

  public static void main(String[] args) {

    Shop shop = new Shop();

    Phone phone = shop.getPhone();

    phone.call();
    phone.sms();

  }

}
