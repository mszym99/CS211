/*
Matthew Szymanski
CSCD 211
This program takes a pre set array of "employeeHours" and sorts from highest to lowest using similar sorting formats as the last couple
problems in this lab.

----jGRASP exec: java CSCD211_Ch0804_WeeklyHoursArray
 Employee 7's  total hours is 41
 Employee 6's  total hours is 37
 Employee 0's  total hours is 34
 Employee 4's  total hours is 32
 Employee 3's  total hours is 31
 Employee 5's  total hours is 28
 Employee 1's  total hours is 28
 Employee 2's  total hours is 20
 
  ----jGRASP: operation complete.

*/



public class CSCD211_Ch0804_WeeklyHoursArray {
// Main
    public static void main(String[] args) {
    // Given employeeHours
        int[][] employeeHours = 
            {{2 ,4, 3, 4, 5, 8, 8},
             {7, 3, 4, 3, 3, 4, 4},
             {3, 3, 4, 3, 3, 2, 2},
             {9, 3, 4, 7, 3, 4, 1},
             {3, 5, 4, 3, 6, 3, 8},
             {3, 4, 4, 6, 3, 4, 4},
             {3, 7, 4, 8, 3, 8, 4},
             {6, 3, 5, 9, 2, 7, 9}};
          
            // Set to each other 
        int[] hoursPerEmployee = sumEmployeeHours(employeeHours);
        // Set to each other as new
        int[] indexList = new int[hoursPerEmployee.length];
        // Sort
        sort(hoursPerEmployee, indexList);
        // For loop to print
        for (int i = 0; i < hoursPerEmployee.length; i++) {
            System.out.println("Employee " + indexList[i] + "'s " + " total hours is " + hoursPerEmployee[i]);
                } 
             }
    // Create sumEmployeeHours
    public static int[] sumEmployeeHours(int[][] hours) {
        int[] hoursPerEmployee = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
            // sum calc to += specific hours
                sum += hours[i][j];
             }
            hoursPerEmployee[i] = sum;
         }
        return hoursPerEmployee;
       }
    
    static void sort(int[] totalHours, int[] indexList) {
        // Fill indexList[]
        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }
        // Find currentMax values and compare them to the others and work downwards
        for (int i = 0; i < totalHours.length; i++) {
            int currentMax = totalHours[i];
            int currentMaxIndex = i;
            
            for (int j = i + 1; j < totalHours.length; j++) {
                if (currentMax < totalHours[j]) {
                    currentMax = totalHours[j];
                    currentMaxIndex = j;
                }
            }
            // Transition from currentMax to totalHours and so forth
            if (currentMaxIndex != i) {
                totalHours[currentMaxIndex] = totalHours[i];
                totalHours[i] = currentMax;
                
                int temp = indexList[currentMaxIndex];                
                indexList[currentMaxIndex] = indexList[i];
                indexList[i] = temp;
            } 
            
            }
          }
    
      }