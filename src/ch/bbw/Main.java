package ch.bbw;

public class Main {

    public static void main(String[] args) {
        int[] data = {432, 2342, 1234, 234, 42, 432, 234};
        int[] bubblesorted = bubblesort(data.clone()); // force pass-by-value
        int[] selectionsorted = selectionsort(data.clone());

        for(int i: bubblesorted){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: selectionsorted){
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
    private static int[] selectionsort(int[] data){
        int smallest_index = 0;
        int temp;
        for(int i = 0; i < data.length; i++){
            for(int j = i; j < data.length; j++){
                if(data[j] < data[smallest_index]){
                    smallest_index = j;
                }
            }
            temp = data[i];
            data[i] = data[smallest_index];
            data[smallest_index] = temp;

        }

        return data;
    }
}
