import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {13,43,23,54,23,65,12,3};
        //mayorEdadRecursivo(array, array.length-1);
        merge(array);
        //System.out.println(Arrays.toString(array));
    }


    public static void merge(int[] array) {
        if (array.length <= 1){
            return;
        }
        int half = array.length/2;
        int[] first_half = Arrays.copyOfRange(array, 0, half);
        merge(first_half);
        System.out.println(Arrays.toString(first_half));
        int[] second_half = Arrays.copyOfRange(array, half, array.length);
        merge(second_half);
        System.out.println(Arrays.toString(second_half));
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first_half.length && j < second_half.length) {
            if (first_half[i] < second_half[j]) {
                array[k] = first_half[i];
                i++;
            } else {
                array[k] = second_half[j];
                j++;
            }
            k++;
        }

        while (i < first_half.length) {
            array[k] = first_half[i];
            i++;
            k++;
        }

        while (j < second_half.length) {
            array[k] = second_half[j];
            j++;
            k++;
        }
    }

    public static void mayorEdad(int[] edades) {
        for (int edad :edades) {
            if (edad >= 18) {
                System.out.println("es mayor : " + edad);
            }
        }
    }

    public static void mayorEdadRecursivo(int[] edades, int index) {
        if (index > -1) {
            if (edades[index] >= 18) {
                System.out.println("es mayor : " + edades[index]);
            }
            index--;
            mayorEdadRecursivo(edades, index);
        }
    }
}
