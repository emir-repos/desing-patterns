public class NameRepository implements Container {

  public String names[] = {"Robert", "John", "Julie", "Lora"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  private class NameIterator implements Iterator {

    int index;  //initialized with zero at the beginning

    @Override
    public boolean hasNext() {
      if (index < names.length) {
        return true;
      }
      return false;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        System.out.println("index : " + index);
        return names[index++];
      }
      return  null;
    }
  }
}
