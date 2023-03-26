public class SelectionSort {
    static double[] array = {4,6.6,9,44,32,5.3,24};
    public static void selectionSort(){
        long startime = System.nanoTime();
        for (int i = 0; i < array.length-1; i++) {
            double min = array[i];
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(min>array[j]){
                    min = array[j];
                    minIndex = j;
                }
            }

            if (minIndex!= i){
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
        System.out.println("thoi gian chay sap xep chon la : " + (System.nanoTime()-startime)+ " nano giay");
    }

    public static void main(String[] args) {
        selectionSort();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" , ");
        }
    }
}
