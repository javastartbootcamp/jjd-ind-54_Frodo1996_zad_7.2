package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public static int sort(int[] inputArray) {

        int compares = 0;
//        boolean itIs = false;

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                compares++;
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
//                    itIs = true;
                }
            }
//            if (!itIs) {
//                break;
//            }
        }
        return compares;
    }
}
