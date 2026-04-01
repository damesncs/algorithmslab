public class InsertionSort {

// APSCA CED 4.15.A.3:
//     Insertion sort inserts an element from the
// unsorted portion of a list into its correct (but
// not necessarily final) position in the sorted
// portion of the list by shifting elements of the
// sorted portion to make room for the new
// element.

    public static void main(String[] args) {
        
        int[] list = RandomListGenerator.getRandomIntArray(100, 1, 1000);

        // courtesy Rosetta Code
        for(int i = 1; i < list.length; i++){
            int value = list[i];
            int j = i - 1;
            while(j >= 0 && list[j] > value){
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = value;
        }
    
        for(int i : list){
            System.out.print(i + " ");
        }


    }
}
