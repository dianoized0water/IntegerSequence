import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    this.start = start;
    this.end = end;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    return (end - start + 1);
  }

  public boolean hasNext(){
    if (current<end){
      return true;
    }
    else{
      throw new NoSuchElementException();
    }
  }

  public int next(){
    int a = 0;
    if (hasNext()){
      current++;
      a = current - 1;
    }
    return a;
  }
}
