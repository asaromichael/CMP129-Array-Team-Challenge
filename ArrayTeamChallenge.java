import java.util.Scanner;
public class ArrayTeamChallenge {

    public static void main(String[] args) {

        int[] scores = {78, 92, 85, 67, 95, 88, 73, 90};
        for(int i=0; i < scores.length; i++){
            System.out.println(scores[i]);
            System.out.println();
        }
        // Challenge 1:
        // Display every score in the array using a loop.


        // Challenge 2:
        
        // Calculate and display the average score.
        // Your solution should still work if more scores are added.
double total = 0;
double average = 0;
 for(int i = 0; i < scores.length; i++)
 total +=scores[i];
 average =  total / scores.length;
System.out.println("average: "+ average);

        // Challenge 3:
        // Find and display the highest and lowest score in the array.
        // Do not simply print 95.
        int maxScore = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > maxScore){
                maxScore = scores[i];
            }
        }
        System.out.println("The Highest score is: " + maxScore); 
        
        int minScore = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < minScore){
                minScore = scores[i];
            }
        }
         System.out.println("The Lowest score is: " + minScore);
         System.out.println();

        // Challenge 4:
        // Count and display how many scores are above the average.
    
        int count = 0;
    
        
        for(int i = 0; i < scores.length; i++){
            if (scores[i] > average){
                count++;
            }
        }    
        System.out.println("Number of count: " + count);
         


        // BONUS 1 - REVERSE ORDER:
        // Display the scores in reverse order.
         for(int j = scores.length - 1; j >= 0; j--) {
            
            System.out.println(scores[j]);   
         }
        
        

        // BONUS 2 - SCORE SEARCH:
	int firstIndex = -1;
	int count = 0;
	
	for (int i = 0; i<scores.length; i++){
		if (scores[i] == userScoreSearch){
			found = true;
			if (firstIndex == -1){
				firstIndex = i;
			}
			count++;
		}
	}
	
	if (found){
		System.out.println("Score found.");
		System.out.println("First index: " + firstIndex);
        System.out.println("Occurrences: " + count);
		}
	else{
		System.out.println("Score not found.");
		}


        // Display the index of the first occurrence.
        // Count how many times the score appears.
        // If it is not found, display an appropriate message.
        

    }
}
