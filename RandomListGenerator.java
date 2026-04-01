public class RandomListGenerator {
    
    public static int[] getRandomIntArray(int length, int minValue, int maxValue){

        int[] r = new int[length];

        for(int i = 0; i < length; i++){
            r[i] = getRandomIntBetween(minValue, maxValue);
        }

        return r;
    }

    // returns a random int between min and max (inclusive)
    public static int getRandomIntBetween(int min, int max){
        double minCeiled = Math.ceil(min);
        return (int) (Math.random() * (Math.floor(max) - minCeiled + 1) + minCeiled);
    }

    


}
