public class Subscriber implements Observer {

  private String name;
  private Channel channel = new Channel();

  @Override
  public void update() {
    System.out.println("Hey "+name+", Video Uploaded " + channel.title );
  }

  @Override
  public void subscribeChannel(Channel ch) {
    channel = ch;
  }

  public Subscriber(final String name) {
    this.name = name;
  }
}
