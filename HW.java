import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Task 1
        int[] arr1 = {5,-3,8,-1,0,12,-7,4,9,-2};
        int replacements = 0;
        System.out.print("\nOriginal: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
            if(arr1[i] < 0){
                replacements++;
                arr1[i] = 0;
            }
        }
        System.out.print("\nModified: ");
        for(int i = 0; i < arr1.length; i++) System.out.print(arr1[i] + " ");
        System.out.print("\nReplacements: " + replacements);

        // Task 2
        int[] arr2 = {10,25,8,30,15,30};
        int largest = arr2[0];
        int secondlargest = 0;
        boolean hasSecond = false;

        System.out.print("\n\nArray: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
            if(arr2[i] > largest){
                secondlargest = largest;
                largest = arr2[i];
                hasSecond = true;
            }else if(arr2[i] < largest && (!hasSecond || arr2[i] > secondlargest)){
                secondlargest = arr2[i];
                hasSecond = true;
            }
        }
        System.out.print("\nLargest: " + largest);
        if(hasSecond){
            System.out.print("\nSecond largest: " + secondlargest);
        }else{
            System.out.print("\nNo second largest distinct number.");
        }

        // Task 3
        int[] numbers = {10,20,30,40,50};
        System.out.print("\n\nOriginal: ");
        for(int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.print("\nEnter index to remove: ");
        int index = scan.nextInt();

        if(index >= 0 && index < numbers.length){
            for(int i = index; i < numbers.length - 1; i++){
                numbers[i] = numbers[i + 1];
            }
            System.out.print("Updated: ");
            for(int i = 0; i < numbers.length - 1; i++) System.out.print(numbers[i] + " ");
        }else{
            System.out.print("Invalid index.");
        }

        // Task 4
        int[] arr4 = {4,7,2,4,9,7,1,2,8,4};
        boolean foundDuplicate = false;
        System.out.print("\n\nArray: ");
        for(int i = 0; i < arr4.length; i++) System.out.print(arr4[i] + " ");
        System.out.print("\nDuplicate numbers: ");

        for(int i = 0; i < arr4.length; i++){
            boolean alreadyPrinted = false;
            for(int j = 0; j < i; j++){
                if(arr4[i] == arr4[j]) alreadyPrinted = true;
            }

            if(!alreadyPrinted){
                for(int j = i + 1; j < arr4.length; j++){
                    if(arr4[i] == arr4[j]){
                        System.out.print(arr4[i] + " ");
                        foundDuplicate = true;
                        break;
                    }
                }
            }
        }
        if(!foundDuplicate) System.out.print("No duplicates found.");

        scan.close();
    }
}
