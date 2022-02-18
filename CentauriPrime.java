/*
Brute force - O(n) time, O(1) space
Approach 
1. Create a method that takes in the kingdom to get the ruler 
- Method signature: private static String getRuler(String kingdom)
- Logic 
  - Store vowels as a string
  - Access the final character in string -> O(1) time
  - Iterate through vowels string to see if the character is a vowel -> O(n)
  - If the char is a vowel, return Alice
  - Else if the char is y or Y, return nobody
  - Else, return Bob 

2. In the main method - handle input/ output
- Take in input from the scanner
- Process data according to the sample input -> 1st line number of cases, remaining lines are kingdoms
- Loop through the kingdoms, calling the getRuler function to return the appropriate ruler 


Optimised - O(1) time, O(1) space 
- Bottleneck of the brute force solution is iterating through the string of vowels 
- Instead, set up a HashSet for the vowels -> O(10) = ~O(1)
- Get lastChar = O(1)
- Checking if the lastChar is a vowel, i.e. HashSet.contains() = O(1)
- Checking if lastChar is y = O(1)
- Returning the ruler = O(1)

*/
import java.util.*;

public class CentauriPrime {
  /* Brute force 
  private static String getRuler(String kingdom) {
    String vowels = "AEIOUaeiou";
    char lastChar = kingdom.charAt(kingdom.length() - 1);

    for (int i = 0; i < vowels.length(); i++) {
      if (finalLetter == vowels.charAt(i)) {
        return "Alice";
      }
    }

    if (lastChar == 'y' || lastChar == 'Y') {
      return "nobody";
    }

    return "Bob";
  }*/

  // Optimised
  private static HashSet<Character> vowels = new HashSet<>(Arrays.asList(
    'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));


  private static String getRuler(String kingdom) {
    char lastChar = kingdom.charAt(kingdom.length() - 1);

    if (vowels.contains(lastChar)) {
      return "Alice";
    } if (lastChar == 'y' || lastChar == 'Y') {
      return "nobody";
    } 
    return "Bob";
  }
  
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      int numCases = scan.nextInt();

      for (int i = 1; i <= numCases; ++i) {
        String kingdom = scan.next();
        String ruler = getRuler(kingdom);
        String output = String.format("Case #%d: %s is ruled by %s.", i, kingdom, ruler);
        System.out.println(output);
      }
    }
  }
}
