public class Main {

    public static void main(String[] args) {

           //1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
           //   a. Programmatically subtract the value of the first element in the array from
           //   the value in the last element of the array (i.e. do not use ages[7] in your code).
           //   Print the result to the console.
            int [] ages = new int[]{3,9,23,64,2,8,28,93};
           System.out.println(ages[0]-ages[ages.length-1]);

        System.out.println("===================================");
        //b.	Add a new age to your array and repeat the step above to ensure it is dynamic
        // (works for arrays of different lengths).
         ages = new int[]{3,9,23,64,2,8,28,93,54};
        System.out.println( ages[0]-ages[ages.length-1]);

        System.out.println("=======================================");

      //  c.	Use a loop to iterate through the array and calculate the average age.
        //  Print the result to the console.
         int sum =0;
         double avg;
         for (int i = 0; i< ages.length;i++){
             sum = sum + ages[i];
         }
         avg = (double)sum/ages.length;
        //System.out.println(sum);
        System.out.println("The average is :" + avg);

        System.out.println("===================================");

      //  2.	Create an array of String called names that contains the following values:
     //   “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String [] names = new String[]{"Sam","Tommy","Tim","Sally","Buck","Bob"};


      //  a.	Use a loop to iterate through the array and calculate the average number of letters per name.
       //         Print the result to the console.

        int totalnumberOfLettersPerNames=0;
        double averageNumberOfLettersPerName;
          for (int i = 0; i< names.length;i++){
              totalnumberOfLettersPerNames = totalnumberOfLettersPerNames+names[i].length();
          }
        System.out.println(totalnumberOfLettersPerNames);
        averageNumberOfLettersPerName = (double) totalnumberOfLettersPerNames / names.length;
        System.out.println(averageNumberOfLettersPerName);
        System.out.println("================================");
       // b.	Use a loop to iterate through the array again and concatenate all the names together,
        //        separated by spaces, and print the result to the console.
        for (int i = 0; i<names.length;i++) {
            System.out.print(names[i] + " ");
        }


        System.out.println("\n================================");
        //  3.	How do you access the last element of any array?
        //  Answer : ->  anyArrayName.length-1

          //  4.	How do you access the first element of any array?
            //Answer : -> AnyArrayname [0];

            //5. Create a new array of int called nameLengths.
            // Write a loop to iterate over the previously created names array
           // and add the length of each name to the nameLengths array.


            int []nameLengths = new int [names.length];
            for (int i = 0; i<nameLengths.length ; i++){
                nameLengths[i]=names[i].length();
            }

          //  6. Write a loop to iterate over the nameLengths array and
         //   calculate the sum of all the elements in the array. Print the result to the console.

        int sumOfElementInNameLengths = 0;
            for(int i = 0; i<nameLengths.length; i++){
                sumOfElementInNameLengths += nameLengths[i];
            }
         System.out.println("The sum of all the elements is the array is: " + sumOfElementInNameLengths);

            //7.	Write a method that that takes a String, word, and an int, n, as arguments and returns the word
          //  concatenated to itself n number of times.
         //  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

        concatenateWord("Hello",3);
        System.out.println("\n====================");

       // 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
        //(the full name should be the first and the last name as a String separated by a space).
        System.out.println(fullName("Steve","St.Fleur"));
        System.out.println("================");

       // 9.	Write a method that takes an array of int and returns true
      //if the sum of all the ints in the array is greater than 100.

        int []arr = new int []{25,20,14, 85};
        System.out.println(sumOfInt(arr));

        System.out.println("==================");

        // 10.	Write a method that takes an array of double and
        // returns the average of all the elements in the array.

        double []array = new double[]{25.2,18.5,14.3};
        System.out.println(averageofTheElement(array));

        System.out.println("===================");
       // 11.	Write a method that takes two arrays of double and returns true
       // if the average of the elements in the first array is greater than the average
        //of the elements in the second array.

        double []myArr1 = new double[]{2.5,5.3};
        double []myArr2 = new double[]{9.2,4.6,4.7};
        System.out.println(averageofElementInBothArrays(myArr1,myArr2));
        System.out.println("================");

        //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
        //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

        System.out.println(willBuyDrink(true,12.50));

        System.out.println("==================");

       // 13.	Create a method of your own that solves a problem.
        //In comments, write what the method does and why you created it.

        evenOrOdd(3);

    }
    public static String concatenateWord (String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(word);
        }
        return word;
    }
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static boolean sumOfInt (int [] arr){
        int sum = 0;
        for (int i =0; i< arr.length;i++){
            sum += arr[i];
        }
        if (sum>100){
            return true;
        }
        return false;
    }
    public static double averageofTheElement(double [] array){
        double sum = 0.0;
        double avg;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        avg =  sum/ array.length;
        return avg;
    }
    public static boolean averageofElementInBothArrays(double [] arr1, double []arr2){
        double sum1 = 0.0;
        double sum2 = 0.0;
        double avg1, avg2;

        for (int i =0 ; i<arr1.length;i++){
            sum1 += arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            sum2+=arr2[i];
        }
        avg1 = sum1/ arr1.length;
        avg2 = sum2/ arr2.length;

        if (avg1>avg2){
            return true;
        }
        return false;
    }

    public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
        if ((isHotOutside==true && moneyInPocket>10.50)){
            return true;
        }
        return false;
    }
    // This method will test if the number entered is even or odd.
    public static void evenOrOdd(int numb){
        if (numb % 2== 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }


}