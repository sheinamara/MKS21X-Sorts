public class Sorts{
////////////
// CODING //
////////////
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    int end = data.length;
    if (end > 1){
      for (int i = 0; i < end; i++){
        int value = 0;
        int a = data[i];
        for (int x = i + 1; x < end; x++){
          if (data[x] < a){
            value = data[i];
            a = data[x];
            data[x] = value;
            data[i] = a;
          }
        }
      }
    }
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int larger = 0;
    if (data.length > 1){
      for (int i = 0; i < data.length - 1; i++){
        for (int x = 1; x < data.length - i; x++){
          if (data[x - 1] > data[x]){
            larger = data[x - 1];
            data[x - 1] = data[x]; // make the first element that shows up the smaller one
            data[x] = larger; // make the later element that shows up the larger one
          }
        }
      }
    }
  }
  /** Insertion sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void insertionSort(int[] data){
    for (int i = 1; i < data.length; i++){
      int current = data[i]; // start at the second element
      int limit = i - 1; // the bordering element
      while (limit >= 0 && data[limit] > current){
      // as the bordering element's index does not become negative and the bordering element is greater than the element we are trying to move
        data[limit + 1] = data[limit];
        // make the element after the bordering element (expanding the "sorted" section of the array)
        limit = limit - 1;
        // lower the limit
      }
      data[limit + 1] = current;
      // as soon as the elment we are trying to move is greater, we drop it in!
    }
  }
}
