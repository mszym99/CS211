/*
Matthew Szymanski
CSCD211
Sorting a 2D array
Takes a preset array that we call array and sorts through using a custom sort method. This method transfers all the numbers
it sorts through to the original spot. So for example it would sort through and see that {1, 7} is lower than {4, 2} and 
replace that.

 ----jGRASP exec: java CSCD211_Ch0816_SortRowsColumnsArray
 {1, 1}
 {1, 2}
 {1, 7}
 {4, 1}
 {4, 2}
 {4, 5}
 
  ----jGRASP: operation complete.

*/

public class CSCD211_Ch0816_SortRowsColumnsArray {
  /* Main method */
	public static void main(String[] args) {
		// Initialize array
		int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

		// sort array
		sort(array);

		// Display sorted array
		for (int i = 0; i < array.length; i++) {
      // Formatting first bracket
         System.out.print("{");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
            if (j == 0) {
            // Formatting comma when j == 0
               System.out.print(", ");
           } 
			}
         // Formatting last bracket
         System.out.println("}");
		}
		
	   }

	/* sort sorts an array primary on rows and secondary on columns */
	public static void sort(int m[][]) {
		int[] min = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			min[0] = m[row][0]; 
			min[1] = m[row][1]; 
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || 
					 m[i][1] < min[0] || m[i][1] < min[1])) { 
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			if (index != row){
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = min[0];
				m[row][1] = min[1]; 
			}
		   }
	     }
     }