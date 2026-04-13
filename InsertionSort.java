public class InsertionSort {

// APSCA CED 4.15.A.3:
//     Insertion sort inserts an element from the
// unsorted portion of a list into its correct (but
// not necessarily final) position in the sorted
// portion of the list by shifting elements of the
// sorted portion to make room for the new
// element.

    public static void main(String[] args) {
        
        int[] list = RandomListGenerator.getRandomIntArray(100000, 1, 100000);

        long swaps = 0;
        long startTime = System.currentTimeMillis();

        // courtesy Rosetta Code, modified DA
        for(int currentPlace = 1; currentPlace < list.length; currentPlace++){
            int value = list[currentPlace];
            int check = currentPlace - 1;
            while(check >= 0 && list[check] > value){
                list[check + 1] = list[check];
                swaps++;
                check = check - 1;
            }
            list[check + 1] = value;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Swaps = " + swaps);
        System.out.println("elapsed time = " + (stopTime - startTime) + " ms");

        // for(int i : list){
        //     System.out.print(i + " ");
        // }
    }
}
