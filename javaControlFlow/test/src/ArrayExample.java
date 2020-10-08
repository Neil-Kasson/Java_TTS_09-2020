public class ArrayExample {
    public static void main(String[] args) throws Exception {
        // Another way to create an EMPTY array (for example, if array of int, all elements will be 0; String, all will be "")
        // dataType[] arrayName = new dataType[arrayLength]

        // This will create an int array containing 10 zeros:
        int[] intArray = new int[10];

        // Print empty array
        System.out.println("Empty intArray: "+printArr(intArray));

        // This will fill the array with the numbers 0-9 (the numbers of the indexes in the array)
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        // Print filled array
        System.out.println("Filled intArray: "+printArr(intArray));

    }


    

    // This method takes an int array as input and returns a string of the contents of the array
    public static String printArr(int[] arr){
        
        // Initialize an ampty String
        String s = "";
        
        // Add all but last element from array to String s, followed by a comma and a space
        for (int i = 0; i < arr.length-1; i++) {
            s += arr[i] + ", ";
        }
        
        // Add final array element to String s (not followed by a comma or space)
        s += arr[arr.length-1];

        // Returns String s back to wherever this method was called from
        return s;
    }
}
