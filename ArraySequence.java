import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  public ArraySequence(int []other){
    currentIndex = 0;
    data = other;
  }

  public ArraySequence(IntegerSequence otherseq){
    int a = otherseq.length();
    otherseq.reset();
    data = new int[a];
    for (int i=0; i<a; i++){
      data[i] = otherseq.next();
    }
    currentIndex = 0;
    otherseq.reset();
  }

  public boolean hasNext(){
    return currentIndex<data.length;
  }

  public int next(){
    if(hasNext()){
      return data[currentIndex++];
    }
    else{
      throw new NoSuchElementException();
    }
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }
}
