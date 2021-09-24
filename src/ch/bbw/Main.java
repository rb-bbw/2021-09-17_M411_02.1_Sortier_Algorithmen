package ch.bbw;

public class Main {

    public static void main(String[] args) {
        int[] data = {432, 2342, 1234, 234, 42, 432, 234};
        int[] bubblesorted = bubblesort(data);

        for(int i: bubblesorted){
            System.out.print(i + " ");
        }
    }
    private static int[] bubblesort(int[] data){
        int temp;
        for(int i = data.length; i > 0; i--){
            for(int j = 0; j < i-1; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        return data;
    }
}
