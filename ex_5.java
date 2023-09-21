public int[] quicksort(int[] array) {

  if(array.length <= 1) {
    return array;
  }

  int pivot = array[0];
  int left[] = new int[0];
  int right[] = new int[0];

  for(int i = 1; i < array.length; i++) {
    if(array[i] < pivot) {
      left = addElement(left, array[i]);
    } else {  
      right = addElement(right, array[i]);
    }
  }

  int[] sortedLeft = quicksort(left);
  int[] sortedRight = quicksort(right);

  int[] sorted = new int[left.length + 1 + right.length];

  for(int i = 0; i < sortedLeft.length; i++) {
    sorted[i] = sortedLeft[i]; 
  }

  sorted[left.length] = pivot;

  for(int i = 0; i < sortedRight.length; i++) {
    sorted[left.length + 1 + i] = sortedRight[i];
  }

  return sorted;

}

// Método auxiliar para adicionar elemento em array
public int[] addElement(int[] array, int element) {
  int[] newArray = Arrays.copyOf(array, array.length + 1);
  newArray[newArray.length-1] = element;
  return newArray;
}
