import java.util.*;

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
}
