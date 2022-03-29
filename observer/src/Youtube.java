public class Youtube {

  public static void main(String[] args) {

    Channel telusko = new Channel(); // channel created

    Subscriber s1 = new Subscriber("Akshay"); // subscriber  s1 created
    Subscriber s2 = new Subscriber("Sonam");  // subscriber  s2 created
    Subscriber s3 = new Subscriber("Harsh");  // subscriber  s3 created
    Subscriber s4 = new Subscriber("Kiran");  // subscriber  s4 created
    Subscriber s5 = new Subscriber("Pravin"); // subscriber  s5 created

    telusko.subscribe(s1); // add subscriber s1 to channel telusko
    telusko.subscribe(s2); // add subscriber s2 to channel telusko
    telusko.subscribe(s3); // add subscriber s3 to channel telusko
    telusko.subscribe(s4); // add subscriber s4 to channel telusko
    telusko.subscribe(s5); // add subscriber s5 to channel telusko

    telusko.unsubscribe(s3);

    s1.subscribeChannel(telusko); //subscriber s1 knows which channel he subscribed
    s2.subscribeChannel(telusko);
    s3.subscribeChannel(telusko);
    s4.subscribeChannel(telusko);
    s5.subscribeChannel(telusko);

    telusko.upload("How to learn Programming??");
  }

}
