public class Arrays {

        public static void main(String[] args) {
            // Declare an array of integers
            int[] numbers = {10, 20, 30, 40, 50};

            // Calculate the sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // Display the elements of the array and the sum
            System.out.println("Elements of the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element " + i + ": " + numbers[i]);
            }

            System.out.println("Sum of all elements: " + sum);
        }
    }


