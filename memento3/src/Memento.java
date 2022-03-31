public class Memento {  // set state through constructor and access it through getter

  private String state;

  public Memento(final String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
