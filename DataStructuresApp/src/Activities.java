//kevin banze
import java.util.*;

public class Activities {
	String action;
	String objective;
	boolean forAll;
	boolean objects;
	int numPpl;
	
	
	//constructor for activities
	public Activities(String action, String objective, boolean forAll, boolean objects, int numPpl) {
		this.action = action;
		this.objective = objective;
		this.forAll= forAll;
		this.objects= objects;
		this.numPpl = numPpl;
	}
	
	
	//method for intro
	public static void intro(){
		System.out.println("According to MayoClinic.org, adults should be active for at least 30 minutes a day.");
		System.out.println("In the tech world, this is especially important.");
		System.out.println("A person with a career in tech will sit at a computer for around 8 hours a day if not more.");
		System.out.println("This can over time create stress on your body and leave you in pain constantly.");
	}
	
	
	//method for continued intro
	public static void cont() {
		System.out.println("Some activities listed above can be very competitive.");
		System.out.println("To become better at them, training is necessary.");
		System.out.println("We can go through a basic full body workout if you are interested.");
		System.out.println("Doing this over a long period of time will help you become stronger in all aspects.");
	}
	
	
	//printing out details of activity
	public static void print(Activities x) {
		System.out.println("Activity: " + x.action);
		System.out.println(x.objective);
		if(x.forAll == true) {
			System.out.println("Everybody can preform this activity.");
		}
		else {
			System.out.println("You should only do this if you are capable.");
		}
		
		if(x.objects == true) {
			System.out.println("You will need some equipment to do this activity. Eqiupment needed will be touched on in the description of the activity.");
		}
		else {
			System.out.println("All you need is your own body for this activity.");
		}
		
		if (x.numPpl <= 1) {
			System.out.println("You can do this activity by yourself.");
		}
		else {
			System.out.println("You will need at least " + x.numPpl + " people to do this activity.");
		}
	}
	
	
	//print out objective only
	public static void obejctive(Activities x) {
		System.out.println(x.objective);
	}
	
	
}
