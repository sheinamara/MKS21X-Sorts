public class Sorts{
  public static void selectionsort(int [] ary){
    int end = ary.length;
    int point;
    int storage;
    for (int start = 0; start < end; start++){
      point = start;
      for (int i = start; i < end; i++){
        if (ary[i] < ary[point]){
          point = i;
        }
      }
      storage = ary[point];
      ary[point] = arty[start];
      ary[start] = storage;

    }
  }
}
