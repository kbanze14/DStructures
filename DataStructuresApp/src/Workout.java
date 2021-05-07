//Kevin Banze
import java.util.*;

public class Workout extends Activities {
	String name;
	String describe;
	int sets;
	int reps;
	int timeBetween;
	boolean weights;
	boolean machine;
	int diff;
	
	//constructor that calls the super from Activities
	public Workout(String action, String objective, boolean forAll, boolean objects, int numPpl, String name, String describe, int sets, int reps, int timeBetween, boolean weights, boolean machine, int diff) {
		super(action, objective, forAll, objects, numPpl);
		this.name =  name;
		this.describe = describe;
		this.sets = sets;
		this.reps = reps;
		this.timeBetween= timeBetween;
		this.weights = weights;
		this.machine = machine;
		this.diff = diff;
	}
	
	
	//prints only description of workout
	public static void wDesc(Workout x) {
		System.out.println(x.describe);
	}
	
	
	//All details for workout, used for polling the queue
	public static void workoutInfo(Workout x) {
		System.out.println("Exercise name: " + x.name);
		
		
		System.out.println("Difficulty: " + x.diff);
		
		
		//if you need weights, get some, if not then body weight exercise
		if(x.weights == true) {
			System.out.println("You will need weights for this exercise. Choose weights that arent too heavy or light.");
		}
			else {
				System.out.println("You do not need weights for this.");
			}
		
		
		//can use machine
		if(x.machine == true) {
			System.out.println("You can use a machine for this exercise, if you feel more comfortable doing so.");
		}
			else {
				System.out.println("You do not need to use a machine for this.");
			}
				
		
		//describe steps for workout
		System.out.println(x.describe);
		
		
		//how many of each execise to do
		System.out.println("You will be doing " + x.sets + " set(s) and " + x.reps + " rep(s).");
		if (x.timeBetween == 0) {
			System.out.println("-----------------");
		}
			else {
				System.out.println("Rest for " + x.timeBetween + " seconds in between sets.");
				System.out.println("-----------------");
			}
		
	}
	
	
	//pre workout stretching
	public static void stretch() {
		System.out.println("Start with some stretching.");
		System.out.println("Stretching will decrease your chances of getting injured while training.");
		System.out.println("It will also leave you feeling less tight throughout your body.");
	}
	
	
}
