//Kevin Banze
import java.util.*;
import java.io.*;
public class Base {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String key;
		
		
		//creating array where i will put the activities in
		Activities Tag = new Activities("Tag", "1 player is 'it' and the other players run from the person who is 'it'. If the person who is 'it' touches someone \nelse, that person is now 'it' and everyone else has to run away from them.", true, false, 2);
		Activities Spud = new Activities("SPUD", "1 player is 'it'. The others will form a circle around the player leaving 3 steps in between them and the 'it'. \nEach person will be assigned a number from 1 - however many are playing.'It' will throw the ball \nstraight up and say a number. Everyone will run as far away as they can, even the person who was 'it', \nexcept the person whos number was called. This person is now 'it'. \nThat person will then try and get the ball. Once they get the ball, they will yell 'SPUD'. \nAt this time all everyone else will stop moving. The person with the ball can take 4 giant steps. \nThey will then have 1 try to hit another player with the ball. The other players are not allowed to move their feet but can wiggle out of the way. \nIf they get hit, they get 1 letter of SPUD. The game then resets and whoever threw the ball is now in the center of the circle. \nIf they get all letters, that player loses.", true, true, 3);
		Activities Hide = new Activities("Hide 'n Seek", "1 player is a seeker and the other players are hiders. The seeker counts to 60 while the hiders find a place to hide. \nWhen the person seeking gets to 60, they go and try to find the people hiding. \nIf the seeker finds a person hiding, they must touch them to get them out and win. \nThe person who got tagged is now the seeker for next round.", true, false, 3);
		Activities Basketball = new Activities("Basketball", "You will need a basketball and a hoop to play. There are 2 teams consisting of 1-5 players on each team. \nThe team with the ball is offense. They are trying to put the ball in the hoop. \nThe other team is on defense trying to prevent them from scoring. If the offense scores, \nthey get 1 point and the opposing team will then get the ball. You have to dribble the ball on offense \nor the opposing team gets the ball. The defense can not make any contact with the person with the \nball if they are in the act of shooting. First to 11 points, win by 2. ", false, true, 2);
		Activities Football = new Activities("Football", "You will need a football and an open space. There are 2 teams of even size. Team with the ball \nis offense, team without ball is defense. The team with the ball is supposed to score \nby having sombeody on there team holding the ball in the endzone. The team on defense \ntries to prevent that by tackling the person with the ball. \nWhen the offense scores, they get 7 points and the ball goes to the opposing team.", false, true, 6);

		
		//creating array that houses activities
		Activities [] act = {Tag, Spud, Hide, Basketball, Football};
		
		
		//creating workout objects
		Workout curls = new Workout("Train", "Get Stronger Arms", false, true, 1, "Bicep Curls", "For this workout, you will need to start both weights at your \nhips, and then keeping your back straight, curl them up near your chest and gently lower them.", 4, 10, 60, true, false, 7);
		Workout squats = new Workout("Train", "Get Stronger Legs", false, true, 1, "Squats", "For this workout, you will need to have your arms rested at your side. You will then \nlower your butt while keeping your calves perpindicular to the floor, then back up to the resting position. At the bottom of your squat, your calves and thighs \nshould form a right angle. If you are using a smith machine, the same instructions will work but you will rest the bar on top of your traps.", 6, 15, 60, true, true, 10);
		Workout rows = new Workout("Train", "Get a Stronger Back", false, true, 1, "Dumbbell Rows", "For this workout, you will need to put your knee and hand of the side not holding \nthe weight on a bench and bend over making your back straight. Then, you will pull the weight up to your rib cage, and gently lower. Repeat this for the other side.", 4, 10, 60, true, false, 5);
		Workout triceps = new Workout("Train", "Get Stronger Arms", false, true, 1, "Tricep Extensions", "For this workout, you will need to position a dumbbell above your head, this is your \nresting position. Lower the weight slowly behind your head and raise it back to resting position.", 4, 10, 60, true, false, 3);
		Workout pushups = new Workout("Train", "Get Stronger Chest/Back/Arms", false, false, 1, "Pushups", "For this workout, you are going to do a regular puhsup, then a diamond pushup, which \nis when you make your grip into a diamond with your hands, and then a wide pushup which is when you extend your arms far apart. 1 set is 7 of each.", 4, 10, 60, true, false, 6);
		Workout planks = new Workout("Train", "Get a Stronger Core", false, false, 1, "Planks", "For this workout, you are going to lay stomach down, put your forearms down where your \nshoulders are, and raise yourelf. You will hold this position for 60 seconds.", 4, 10, 60, true, false, 5);
		Workout running = new Workout("Train", "Improve Cardio/Stronger Legs", false, false, 1, "Running", "For this workout,you are going to run for a mile.", 4, 10, 60, true, false, 1);
		
		
		//creating list and adding elements to list
		LinkedList <Workout> w = new LinkedList <Workout>();
		w.add(curls);
		w.add(squats);
		w.add(rows);
		w.add(triceps);
		w.add(pushups);
		w.add(planks);
		w.add(running);
		
		
		//menu display
		int menuChoice = menu();
		
		
		if(menuChoice > 3 || menuChoice < 1) {
			System.out.println("Goodbye.");
			System.exit(0);
		}
		
		//choice do display activities
		else if (menuChoice == 2) {
			for (int x = 0; x < act.length; x++) {
				Activities e = act[x];
				System.out.println(e.action);
			}
			System.out.println("Continue? Yes or No");
			String choice = keyboard.nextLine();
			if(choice.equalsIgnoreCase("yes")) {
				menuChoice = 1;
			}
		}
		
		
		//choice to display workout
		else if(menuChoice == 3) {
			for(int x = 0; x < w.size(); x++) {
				Workout z = w.get(x);
				System.out.println(z.name);
			}
			System.out.println("Continue? Yes or No");
			String choice = keyboard.nextLine();
			if(choice.equalsIgnoreCase("yes")) {
				menuChoice = 1;
			}
		}
		
		
		//intro for program
		else if(menuChoice == 1)
		Activities.intro();
		System.out.println("--------------------------");
		
	
		System.out.println("--------------------------");
		
		
		System.out.println("Here are some games you can play to keep you active below.");
		//do while loop if user wants more info
		do {
			for (int x = 0; x < act.length; x++) {
				Activities e = act[x];
				System.out.println(e.action);
			}
			System.out.println("--------------------------");
		System.out.println("If you would like more information type in the name of the activity. If not just press enter/return: ");
		key = keyboard.nextLine();
		
		//sequential search
		for (int x = 0; x < act.length; x++) {
			Activities e = act[x];
			if (key.equalsIgnoreCase(e.action)) {
				Activities.print(e);
				System.out.println("--------------------------");
			}
		}
		
		
		System.out.println("--------------------------");
		}while(!key.equalsIgnoreCase(""));
		
		
		System.out.println("--------------------------");
		
		
		Activities.cont();
		System.out.println("--------------------------");
		
		
		System.out.println("Continue to the workout? Yes or No");
		String opt2 = keyboard.nextLine();
		if(opt2.equalsIgnoreCase("yes")) {
		//printing workout
		System.out.println("Here is the workout");
			for(int x = 0; x < w.size(); x++) {
				Workout z = w.get(x);
				System.out.println(z.name);
			}
		}
		else {
			System.out.println("Okay have a good day!");
			System.exit(0);
		}
		
		
		
		System.out.println("--------------------------");
		System.out.println("Lets jump into it!");
		
		
		//queue that polls each exercise when the user is done with the first
		Queue <Workout> q = new LinkedList<Workout>();
		q.add(curls);
		q.add(squats);
		q.add(rows);
		q.add(triceps);
		q.add(pushups);
		q.add(planks);
		q.add(running);
		
		
		//pre workout strecthes
		Workout.stretch();
		System.out.println("When youre done stretching press any key to continue.");
		System.out.println("You can exit the workout at any time by typing in exit");
		String opt3 = keyboard.nextLine();
		
		
		//doing the workout
		//poll the queue when the user presses a key
		while(!q.isEmpty() && !opt3.equalsIgnoreCase("exit")) {
			Workout z = q.poll();
			Workout.workoutInfo(z);
			if(!q.isEmpty()) {
				System.out.println("Press any key to continue: ");
				opt3 = keyboard.nextLine();
			}
		}
		
		
		if(opt3.equalsIgnoreCase("exit")) {
			System.out.println("Try again when you have more time!");
			System.exit(0);
		}
		

		System.out.println("You finished the workout! Good job!");
		
		
		//bubble sort
		System.out.println("For future reference, some of these exercises can be difficult to perform correctly");
		System.out.println("The exercises in terms of easiest to perform correctly to hardest are as follows: ");
		for (int x = 0; x < w.size(); x++) {
			for(int y = x+1; y < w.size(); y++) {
				if (w.get(x).diff >= w.get(y).diff) {
					Workout temp = w.get(x);
					w.set(x, w.get(y));
					w.set(y, temp);
				}
			}
		}
		for(int x = 0; x < w.size(); x++) {
			Workout z = w.get(x);
			System.out.println(z.name);
		}
		
		
		System.out.println("Would you like to read the directions of a workout again? Yes or No ");
		String opt4 = keyboard.nextLine();
		
		
		//asking user if they need directions for any workout
		while(opt4.equalsIgnoreCase("yes")) {
				System.out.println("You may want to watch a video on the exercise if it is still hard to do.");
				System.out.println("Enter the name of the workout or type in anything else to continue: ");
				String myWorkout = keyboard.nextLine();
				for (int x = 0; x < w.size(); x++) {
					Workout z = w.get(x);
					if(myWorkout.equalsIgnoreCase(z.name)) {
						Workout.wDesc(z);
					}
				}
		}
		
		
		//track progress in a file
		System.out.println("Would you like to track your progress? Yes or No.");
		String opt5 = keyboard.nextLine();
		if(opt5.equalsIgnoreCase("yes")) {
			Person you = Person.questions();
			Person.savePath(you);
			System.out.println("Check the file to see your progress.");
			System.out.println("--------------------------");
		}
		
		
		else {
			System.out.println("If you ever want to track your progress just run the app again.");
			System.exit(0);
		}
		System.out.println("Thank you for using my app!");
	}

	
	//menu method
	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 0;
		System.out.println("Welcome to my activities app!");
		System.out.println("1.\tStart");
		System.out.println("2.\tView Activities");
		System.out.println("3.\tView Workout");
		System.out.println("4.\tExit");
		menuChoice = keyboard.nextInt();
		return menuChoice;

	}

	}


