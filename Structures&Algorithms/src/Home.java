//Kevin Banze
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating the class with structures in it
				struct a = new struct();
				
				//same thing over and over
				//starting timer running sort ending timer
				Instant start = Instant.now();
				struct.bubbleSortArray(a.array);
				Instant finish = Instant.now();
				long timeElapsedArrayB = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.bubbleSortList(a.list);
				finish = Instant.now();
				long timeElapsedListB = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.bubbleSortAList(a.aList);
				finish = Instant.now();
				long timeElapsedAListB = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.selectionSortArray(a.array);
				finish = Instant.now();
				long timeElapsedArrayS = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.selectionSortList(a.list);
				finish = Instant.now();
				long timeElapsedListS = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.selectionSortAList(a.aList);
				finish = Instant.now();
				long timeElapsedAListS = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.insertionSortArray(a.array);
				finish = Instant.now();
				long timeElapsedArrayI = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.insertionSortList(a.list);
				finish = Instant.now();
				long timeElapsedListI = Duration.between(start, finish).toMillis();
				
				start = Instant.now();
				struct.insertionSortAList(a.aList);
				finish = Instant.now();
				long timeElapsedAListI = Duration.between(start, finish).toMillis();
				
				//Printing times for sorts
				System.out.println("Bubble Sort times------------");
				System.out.println("Array: " + timeElapsedArrayB + " ms");
				System.out.println("Linked List: " + timeElapsedListB + " ms");
				System.out.println("Array List: " + timeElapsedAListB + " ms");
				
				System.out.println("Selection Sort times------------");
				System.out.println("Array: " + timeElapsedArrayS + " ms");
				System.out.println("Linked List: " + timeElapsedListS + " ms");
				System.out.println("Array List: " + timeElapsedAListS + " ms");
				
				System.out.println("Insertion Sort times------------");
				System.out.println("Array: " + timeElapsedArrayI + " ms");
				System.out.println("Linked List: " + timeElapsedListI + " ms");
				System.out.println("Array List: " + timeElapsedAListI + " ms");
			}
		}
	


