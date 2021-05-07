//kevin banze
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Person {
	String date;
	int weight, setCurls, repCurls, setSquats, repSquats, setRows, repRows, setTris, repTris, setPush, repPush, plankSets, plankTime;
	float runDist, runTime;
	String userPath;
	static Scanner keyboard = new Scanner(System.in);

	//constructor to track progress
	public Person(String date,int weight, int setCurls, int repCurls, int setSquats, int repSquats, int setRows,int repRows, int setTris, int repTris, int setPush, int repPush, int plankSets, int plankTime, float runDist, float runTime) {
		this.weight = weight;
		this.date = date;
		this.setCurls = setCurls;
		this.repCurls = repCurls;
		this.setSquats = setSquats;
		this.repSquats = repSquats;
		this.setRows = setRows;
		this.repRows = repRows;
		this.setTris = setTris;
		this.repTris = repTris;
		this.setPush = setPush;
		this.repPush = repPush;
		this.plankSets = plankSets;
		this.plankTime = plankTime;
		this.runDist = runDist;
		this.runTime = runTime;
	}


	//asking needed info to track progress 
	//its alot i know
	public static Person questions() {
		System.out.println("We will need to record several things to keep your progress accurate.");
		System.out.println("What date did you do the workout? Please use the format of MM/DD/YYYY ");
		String date = keyboard.nextLine();
		System.out.println("What did you weigh before doing the workout: ");
		int weight = keyboard.nextInt();
		System.out.println("How many sets and reps of curls did you do? Enter nuber of curls, then press enter, followed by number of reps: ");
		int setCurls = keyboard.nextInt();
		int repCurls = keyboard.nextInt();
		System.out.println("Squat sets and reps: ");
		int setSquats = keyboard.nextInt();
		int repSquats = keyboard.nextInt();
		System.out.println("Row sets and reps: ");
		int setRows = keyboard.nextInt();
		int repRows = keyboard.nextInt();
		System.out.println("Tricep Extension sets and reps: ");
		int setTris = keyboard.nextInt();
		int repTris = keyboard.nextInt();
		System.out.println("Pushup sets and reps: ");
		int setPush = keyboard.nextInt();
		int repPush = keyboard.nextInt();
		System.out.println("plank sets and time plank was held for in seconds: ");
		int plankSets = keyboard.nextInt();
		int plankTime = keyboard.nextInt();
		System.out.println("Running Distance in miles and time it took to run in minutes. For example, 1.25 (press enter) 7.36: ");
		float runDist = keyboard.nextFloat();
		float runTime = keyboard.nextFloat();
		Person me = new Person(date, weight, setCurls, repCurls, setSquats, repSquats, setRows, repRows, setTris, repTris, setPush, repPush, plankSets, plankTime, runDist, runTime);
		return me;
	}


	//saving the progress to a file
	public static void savePath(Person x) {
		try {
			FileWriter fw = new FileWriter("/Users/kevinbanze/Desktop/DS.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Weight on the date of " + x.date + ": " + x.weight);
			pw.println("Sets of curls: " + x.setCurls + "\tReps of curls: " + x.repCurls);
			pw.println("Sets of squats: " + x.setSquats + "\tReps of squats: " + x.repSquats);
			pw.println("Sets of rows: " + x.setRows + "\tReps of rows: " + x.repRows);
			pw.println("Sets of tricep extensions: " + x.setTris + "\tReps of tricep extensions: " + x.repTris);
			pw.println("Sets of pushups: " + x.setPush + "\tReps of pushups: " + x.repPush);
			pw.println("Sets of planks: " + x.plankSets + "\tTime held during planks: " + x.plankTime);
			pw.println("Distance Ran: " + x.runDist + "\tTime it took to run: " + x.runTime);
			pw.println("**********************************************");
			pw.println("----------------------------------------------");
			fw.close();
			pw.close();
			}
		catch(Exception e) {
			System.out.println("File could not be opened.");
		}
	}
}
