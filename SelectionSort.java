public class SelectionSort {
    
// APCSA CED 4.15.A.2:
//     Selection sort repeatedly selects the smallest
// (or largest) element from the unsorted portion
// of the list and swaps it into its correct (and final)
// position in the sorted portion of the list.

    public static void main(String[] args) {

        int[] list = RandomListGenerator.getRandomIntArray(100000, 0, 1000);
        int swaps = 0;

        long startTime = System.currentTimeMillis();

        // courtesy Rosetta Code
        for(int currentPlace = 0; currentPlace < list.length - 1; currentPlace++){
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace + 1;
            for(int check = currentPlace; check < list.length; check++){
                if(list[check] < smallest){
                    smallestAt = check;
                    smallest = list[check];
                }
            }
            int temp = list[currentPlace];
            list[currentPlace] = list[smallestAt];
            list[smallestAt] = temp;
            swaps++;
        }

        long stopTime = System.currentTimeMillis();

        System.out.println("Swaps = " + swaps);
        System.out.println("elapsed time = " + (stopTime - startTime));
    
        // for(int i : list){
        //     System.out.print(i + " ");
        // }
    }

}
