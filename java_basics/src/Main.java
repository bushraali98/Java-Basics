import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Develop a program that takes the weight (in kilograms) and height (in meters)
//        as input and calculates the BMI, then prints it.
//            • Input: Weight (kg) = 70, Height (m) = 1.75
//            • Expected Output: BMI = 22.86

       Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms: ");
        double weight = input.nextFloat();

        System.out.println("Please enter your height in meters: ");
        double height = input.nextFloat();

        double BMI = weight / (height * height);
        System.out.println("BMI = " + (BMI));

        System.out.println("\n============================\n");


//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//            • Input: Obtained Marks = 85, Total Marks = 100
//            • Expected Output: Percentage = 85.0%

        System.out.println("Please enter your Obtained Marks: ");
        float obtained_marks = input.nextFloat();
        System.out.println("Please enter your Total Marks: ");
        float total_marks = input.nextFloat();

        float percentage = (obtained_marks / total_marks) * 100;

        System.out.println("Your Percentage: " + percentage + "%");

        System.out.println("\n============================\n");

//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//            • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//            • Expected Output: Amount in EUR = 85.0

        System.out.println("Please enter your amount: ");
        float amount = input.nextFloat();
        System.out.println("Please enter the exchange rate: ");
        float exchange_rate = input.nextFloat();

        float result = amount * exchange_rate;

        System.out.println("Amount in EUR = " + result);

        System.out.println("\n============================\n");


//        4. Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//            • Input: "Hello, World!"
//            • Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"

        System.out.println("Please enter a string: ");
        String word = input.nextLine();

        StringBuilder reverseWord = new StringBuilder(word).reverse();

        System.out.println("Input: " + word);
        System.out.println("Length of the string: " + word.length() + " And Reversed string: " + reverseWord);

        System.out.println("\n============================\n");

//
//        5. Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//                • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//                • Expected Output: "brown fox"


        System.out.println("Please enter a sentence: ");
        String sentance = input.nextLine();

        System.out.println("Please enter the start index: ");
        int start_index = input.nextInt();

        System.out.println("Please enter the end index: ");
        int end_index = input.nextInt();

        String extract_sentance = sentance.substring(start_index, end_index);

        System.out.println("The sentance: " + sentance);
        System.out.println("The extracted string: " + extract_sentance);

        System.out.println("\n============================\n");


//        6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
//                • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//                • Expected Output: Keyword "jumps" is present in the sentence.

        System.out.println("Please enter a sentance: ");
        String sentance1 = input.nextLine();

        System.out.println("Enter a keyword: ");
        String keyword = input.nextLine();

        if (sentance1.contains(keyword)) {
            System.out.println("Keyword " + keyword + " is present in the sentace");
        } else {
            System.out.println("keyword " + keyword + " is not present" );
        }

        System.out.println("\n============================\n");


//        7. Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified sentence.
//            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//            • Expected Output: "The quick brown cat jumps over the lazy dog"

        System.out.println("Please enter a sentance: ");
        String sentance2 = input.nextLine();

        System.out.println("Enter a word to replace: ");
        String replace_word = input.nextLine();

        System.out.println("Enter a word to replacement: ");
        String replacement_word = input.nextLine();

        String new_sentance = sentance2.replace(replace_word, replacement_word);

        System.out.println("The input sentance: " + sentance2);
        System.out.println("The new replacement sentance: " + new_sentance);

        System.out.println("\n============================\n");


//        8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
//                • Input: String 1 = "Hello", String 2 = "hello"
//                • Expected Output: Strings are equal (ignoring case).

        System.out.println("please enter the first string: ");
        String string1 = input.nextLine();

        System.out.println("please enter the second string: ");
        String string2 = input.nextLine();

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal (ignoring case)");
        }

        System.out.println("\n============================\n");

    }
}