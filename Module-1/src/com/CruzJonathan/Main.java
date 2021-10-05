package com.CruzJonathan;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 48;
        numbers[1] = 67;
        numbers[2] = 89;
        numbers[3] = 123;
        numbers[4] = 156;
        numbers[5] = 418;
        numbers[6] = 78;
        numbers[7] = -64;
        numbers[8] = 748;
        numbers[9] = 1563;

        System.out.println("Before Selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nDescending Selection sort:");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nDescending Bubble sort:");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
