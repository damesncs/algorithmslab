public class MergeSort{
    // courtesy Java Methods pg 400


    // helper swap array
    private static int[] temp;
    private static int swaps = 0;

    public static void main(String args[]){
        int[] list = RandomListGenerator.getRandomIntArray(100000, 0, 1000);
        

        long startTime = System.currentTimeMillis();

        int n = list.length;
        temp = new int[n];
        mergeSort(list, 0, n - 1);

        long stopTime = System.currentTimeMillis();

        System.out.println("Swaps = " + swaps);
        System.out.println("elapsed time = " + (stopTime - startTime));

        // for(int i : list){
        //     System.out.println(i + " ");
        // }
    }

    public static void mergeSort(int[] a, int from, int to){
        if(to - from < 2){
            if(to > from && a[to] < a[from]){
                //swap a[to] < a[from]
                int atemp = a[to]; a[to] = a[from]; a[from] = atemp;
                swaps++;
            }
        }
        else {
            int middle = (from  + to) / 2;
            mergeSort(a, from, middle);
            mergeSort(a, middle + 1, to);
            merge(a, from, middle, to);
        }
        
    }

    private static void merge(int[] a, int from, int middle, int to){
        int i = from, j = middle + 1, k = from;
        while(i <= middle && j <= to){
            if(a[i] < a[j]){
                temp[k] = a[i];
                i++;
                swaps++;
            } else {
                temp[k] = a[j];
                j++;
                swaps++;
            }
            k++;
        }
        while (i <= middle){
            temp[k] = a[i];
            i++;
            k++;
            swaps++;
        }
        while(j <= to){
            temp[k] = a[j];
            j++;
            k++;
            swaps++;
        }
        for(k = from; k <= to; k++){
            a[k] = temp[k];
            swaps++;
        }
    }


    

}