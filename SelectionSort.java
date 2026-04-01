public class SelectionSort {
    
// APCSA CED 4.15.A.2:
//     Selection sort repeatedly selects the smallest
// (or largest) element from the unsorted portion
// of the list and swaps it into its correct (and final)
// position in the sorted portion of the list.

    public static void main(String[] args) {

        int[] list = RandomListGenerator.getRandomIntArray(100, 0, 1000);

        // courtesy Rosetta Code
        for(int currentPlace = 0; currentPlace<list.length-1; currentPlace++){
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace+1;
            for(int check = currentPlace; check<list.length;check++){
                if(list[check]<smallest){
                    smallestAt = check;
                    smallest = list[check];
                }
            }
            int temp = list[currentPlace];
            list[currentPlace] = list[smallestAt];
            list[smallestAt] = temp;
        }

        for(int i : list){
            System.out.print(i + " ");
        }
    }

}
