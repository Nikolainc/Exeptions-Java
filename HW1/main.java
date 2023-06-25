package HW1;


public class main {

    public static void main(String[] args) {

        int[] arr = new int[] {0,1,1,12,4,7};
        int[] arr2 = new int[] {5,1,11,0,5};

        PrintArr(DiffArray(arr, arr2));

    }

    public static int[] DiffArray(int[] arr1, int[] arr2) {

        CheckArray(arr2, arr1.length);
        CheckArray(arr1);

        int[] diffArray = new int[arr1.length];

        for (int i = 0; i < diffArray.length; i++) {

            diffArray[i] = arr1[i] - arr2[i];
            
        }

        return diffArray;


    }

    public static void CheckArray(int[] arr) {

        if (arr.length == 0) {

            throw new RuntimeException("Массив пустой");

        }

        for (Object i : arr) {

            if(i == null) {

                throw new RuntimeException("Элемент null в массиве");

            }
            
        }

    }

    public static void CheckArray(int[] arr, int leng) {

        if (arr.length == 0) {

            throw new RuntimeException("Массив пустой");

        }

        for (Object i : arr) {

            if(i == null) {

                throw new RuntimeException("Элемент null в массиве");

            }
            
        }
        
        if(arr.length != leng) {

            throw new RuntimeException("Неверная длинна массива");

        }

    }

    public static void PrintArr(int[] arr) {

        for (int i : arr) {

            System.out.println(i);
            
        }

    }
    
}