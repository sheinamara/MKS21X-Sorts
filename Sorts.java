public class Sorts{
  public static void selectionsort(int [] ary){
    int end = ary.length;
    for (int i = 0; i < end; i++){
      int value = 0;
      int a = ary[i];
      for (int x = i + 1; x < end; x++){
        if (ary[x] < a){
          value = ary[i];
          a = ary[x];
          ary[x] = value;
          ary[i] = a;
        }
      }
    }
  }
}
