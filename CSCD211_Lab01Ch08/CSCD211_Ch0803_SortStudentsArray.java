 /*
 Matthew Szymanski
 CSCD 211
 Take the grades given and count them up and then sort the scores in ascending order of low to high
 
  ----jGRASP exec: java SortStudentsScores
 Student 3's correct count is 4
 Student 2's correct count is 5
 Student 1's correct count is 6
 Student 0's correct count is 7
 Student 5's correct count is 7
 Student 6's correct count is 7
 Student 7's correct count is 7
 Student 4's correct count is 8
 
  ----jGRASP: operation complete.
 */
 
 
 
 public class CSCD211_Ch0803_SortStudentsArray   {
 /** Main method */
 public static void main(String[] args) {
 // Students' answers to the questions
 char[][] answers = {
 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

 // Key to the questions
 char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
 
 // Students number and correct answers
 int[][] correctCounts = new int[answers.length][2];

 // Grade all answers
 for (int i = 0; i < answers.length; i++) {
      // Grade one student
      
      for (int j = 0; j < answers[i].length; j++) {
         if (answers[i][j] == keys[j]) {
         correctCounts[i][0] = i;
         correctCounts[i][1]++;
       }
      }
   }

// Sort in increasing order of the num of correct answers
sort(correctCounts);

// Display
for (int row= 0; row < correctCounts.length; row++) {
   System.out.println("Student " + correctCounts[row][0] + "'s correct count is " + correctCounts[row][1]);
      }
   }


// Sort sorts by column in order
public static void sort(int[][] m) {
   for (int i = 0; i < m.length; i++) {
      // find min throughout the column
      int minColumn0 = m[i][0];
      int minColumn1 = m[i][1];
      int minIndex = i;
      
      // Set parameters to check and create
      for (int j = i + 1; j < m.length; j++) {
         if (minColumn1 > m[j][1]) {
            minColumn1 = m[j][1];
            minColumn0 = m[j][0];
            minIndex = j;
            }
         }
      
      // Time to do the swapping
      if (minIndex != i) {
         m[minIndex][0] = m[i][0];
         m[minIndex][1] = m[i][1];
         m[i][0] = minColumn0;
         m[i][1] = minColumn1;
      }
      }
   }
 }
