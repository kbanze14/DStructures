//Kevin Banze
import java.util.*;

public class struct {
	int array [] = new int [1000];
	LinkedList <Integer> list = new LinkedList<Integer>();
	List <Integer> aList = new ArrayList <Integer>();
	Random random = new Random();
	
	//creating constructor that creates all 3 structures and populates
	public struct(){
		for (int x = 0; x<array.length; x++) {
			int r = random.nextInt(100 + 1);
			array[x] = r;
			list.add(r);
			aList.add(r);
		}
	}
	
	
	//Array listbubble sort
	// compares x to y
	// if x > y
	//swap the numbers iterate through loop until no swpas needed
	public static void bubbleSortAList(List<Integer> aList) {
		for  (int x = 0; x < aList.size(); x++) {
			for (int y = x+1; y<aList.size(); y++) {
				if(aList.get(x) >= aList.get(y)) {
					int temp = aList.get(x);
					aList.set(x, aList.get(y));
					aList.set(y, temp);
				}
			}
		}
	}
	
	//same as abpve
	public static void bubbleSortList(LinkedList<Integer> list) {
		for  (int x = 0; x < list.size(); x++) {
			for (int y = x+1; y<list.size(); y++) {
				if(list.get(x) >= list.get(y)) {
					int temp = list.get(x);
					list.set(x, list.get(y));
					list.set(y, temp);
				}
			}
		}
	}
	
	//same as above
	public static void bubbleSortArray(int array []) {
		for  (int x = 0; x < array.length; x++) {
			for (int y = x+1; y<array.length; y++ ) {
				if(array[x] >= array[y]) {
					int temp = array[x];
					array[x] = array[y];
					array[y]= temp;
				}
			}
		}
	}
	
	
	//Selection sort
	//loops through with x
	//inner for loop searches for smallest number
	//if smaller number found swap x with the samller number 
	//repeat til sorted
	public static void selectionSortList(LinkedList<Integer> list) {
		for(int x=0; x < list.size();x++ ) {
			int index = x;
			for(int y = x +1; y < list.size(); y++) {
				if (list.get(y) < list.get(index)) {
					index = y;
				}
			}
				int temp = list.get(x);
				list.set(x, list.get(index));
				list.set(index, temp);
		}
	}
	
	
	public static void selectionSortArray(int array[]) {
		for(int x = 0; x < array.length; x++) {
			int index = x;
			for(int y = x + 1; y < array.length;y++) {
				if(array[y] < array[index]) {
					index = y;
				}
			}
			int smallerNumber = array[index];
			array[index] = array[x];
			array[x] = smallerNumber;
		}
	}
	
	
	public static void selectionSortAList(List<Integer> aList) {
		for(int x=0; x < aList.size();x++ ) {
			int index = x;
			for(int y = x +1; y < aList.size(); y++) {
				if (aList.get(y) < aList.get(index)) {
					index = y;
				}
			}
				int temp = aList.get(x);
				aList.set(x, aList.get(index));
				aList.set(index, temp);
		}
	}
	
	
	//Insertion Sort
	//Sets x to the [1] index and the key
	//y is the [0]
	//if y is bigger than the key swap them
	//move the position down to -1 index
	//so the while loop can be broken
	//then add 1 to the index placing itself in the array
	public static void insertionSortArray(int [] array) {
		for (int x = 1; x < array.length; x++) {
            int key = array[x]; 
            int y = x - 1;
            	while (y >= 0 && array[y] > key) {
            		array[y + 1] = array[y];
            		y = y - 1; 
            	} 
            array[y + 1] = key; 
        } 
	}
	
	
	public static void insertionSortList(LinkedList<Integer> list) {
		for (int x = 1; x < list.size(); x++) {
			int key = list.get(x);
			int y = x-1;
				while (y >= 0 && list.get(y) > key) {
					list.set(y+1, list.get(y));
					y = y-1;
				}
			list.set(y+1,  key);
		}
	}
	
	
	public static void insertionSortAList(List<Integer> aList) {
		for (int x = 1; x < aList.size(); x++) {
			int key = aList.get(x);
			int y = x-1;
				while (y >= 0 && aList.get(y) > key) {
					aList.set(y+1, aList.get(y));
					y = y-1;
				}
			aList.set(y+1,  key);
			
		}
	}
}
