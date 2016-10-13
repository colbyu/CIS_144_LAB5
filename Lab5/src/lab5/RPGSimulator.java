package lab5;
import java.util.Random;
// Colby Underhill, Elite Programmer
public class RPGSimulator {
		
    public static void main(String args[]) throws InterruptedException
	{
	Random rand1 = new Random();
	Random rand2 = new Random();
								
	String mission1 = "Capture the Castle";
	String mission2 = "Enter the Hidden City";
	String mission3 = "Rescue the Princess";
	String mission4 = "Traverse the Forest";
	String mission5 = "Locate the Tunnel Entrance";
        //my new missions
        String mission6 = "Pass Java 1";
        String mission7 = "Survive CCC";
		
        String player1 = "", player2 = "", player3 = ""; //adde "The Spoiler"
							
	char letter = '\0', role = '\0';
		
	// initial health and treasures for the two players
        //added "The Spoiler's treasure and health"
	int number = 0, forrestry = 0,bonus = 0, p2Cloaked = 0, p1Cloaked = 0, mission = 0, health1 = 100, health2 = 100, health3 = 100;
	int treasure1 = 100, treasure2 = 100, treasure3 = 100, encounter = 0;
		
	// define your role
        //modified character names
	role = (char)(rand1.nextInt(26) + 'a');
	if(role >= 'a' && role <= 'm') 
            {
            player1 = "Colby              ";
            player2 = "Professor Papademas";
            }
            else 
		{
		player1 = "Professor Papademas";
		player2 = "Colby              ";
		}
	System.out.println("you are " + player1);
	// define your mission
        //Added the neo missions to the randomizer
	number = rand2.nextInt(7) + 1;
        System.out.print("your mission is: ");
            switch(number)
            {
            case 1: System.out.println(mission1); mission = 1; break;
            case 2: System.out.println(mission2); mission = 2; break;
            case 3: System.out.println(mission3); mission = 3; break;
            case 4: System.out.println(mission4); mission = 4; break;
            case 5: System.out.println(mission5); mission = 5; break;
            //the new missions
            case 6: System.out.println(mission6); mission = 6; break;
            case 7: System.out.println(mission7); mission = 7; break;
            }
            System.out.println("");
            //added the below feature to allow the player to attempt to cloak himself
        if (mission == 1 && role >= 'a' && role <= 'm')//if I am player1
            {
            System.out.println("you successfully hide in the shadows");
            p1Cloaked = rand2.nextInt(2);
            if (p1Cloaked == 0)//0 is failure
                {
                System.out.println("Someone turned on a light. You are no longer hidden");
                }
                else if (p1Cloaked == 1)//1 is success
                    {
                    System.out.println("You are well hidden");
                    health1 += 100;
                    }
            if (mission == 1 && role >= 'n' && role <= 'z')//if I am player2
                p2Cloaked = rand2.nextInt(2);
                if (p2Cloaked == 0)
                    {
                    System.out.println("Someone turned on a light. You are no longer hidden");
                    }
                    else if (p2Cloaked == 1)
                    {
                    System.out.println("You are well hidden");
                    health2 += 100;
                    }
                    }
            if (mission == 4)//allows for the forrestry ability, player can avoid SOME 
                {            //encounters by hiding in the vegetation
                forrestry = rand2.nextInt(2);
                if (forrestry == 1)//played successfully hides, forrestry is set to 1 
                                   //and used in the encounters below
                    {
                    System.out.println("you successfully hide in the undergrowth. Your enemy has a hard time spotting you");
                    }
                }
                    
		// let the game simulation commence (limit the # of encounters)
            for (encounter = 1; encounter <= 20; encounter++)
		{
                letter = (char)(rand1.nextInt(3) + 'a');
		number = rand2.nextInt(10) + 1;
		// randomly encounter the enemy
		if(letter == 'a' || letter == 'b')
		//if(mission == 1 || mission == 2 || mission == 3)
                    if (forrestry == 1) //if the player won the previous forrestry check, it's 
                                       //used here to avoid 'a' & 'b' encouners
			{
			health1 -= 0;
			health2 += 0;
                        health3 += 0;
                        treasure3 +=0;
			treasure1 +=0;
			treasure2 -= 0;
			//Thread.sleep(5000);
			System.out.print("battle: " + encounter);
			System.out.println("You managed to hide from the enemy");
                        System.out.println("");
			  //encounter++;
                        }
                        else
                            {
                            health1 -= 10;
			    health2 += 15;
                            health3 += 32;
                            treasure3 +=100;
			    treasure1 += 10;
			    treasure2 -= 10;
			    //Thread.sleep(5000);
			    System.out.print("battle: " + encounter);
			    System.out.println("\t" + "        health" + "\t" + "treasure");
			    System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			    System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			    System.out.println("");
			    }	
			else if(letter == 'c')
                            {
                            health1 += 20;
                            health2 -= 30;
                            health3 += 44;
                            treasure1 += 40;
                            treasure2 -= 20;
                            treasure3 += 76;
                            //Thread.sleep(500);
                            System.out.print("battle: " + encounter);
                            System.out.println("\t" + "        health" + "\t" + "treasure");
                            System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
                            System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
                            System.out.println("");
                            //break;
                            }
                        else if(letter == 'd') //that sucks
                            {
                            health1 = 0;
                            health2 = 0;
                            System.out.println("You have died of dysentery :(");
                            //Thread.sleep(500);
                            System.out.print("battle: " + encounter);
                            System.out.println("\t" + "        health" + "\t" + "treasure");
                            System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
                            System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
                            System.out.println("");
                            //break;
                            }
                            else
                                {
                                health1 += 30;
                                health2 -= 20;
                                health3 +=9;
                                treasure1 -= 30;
                                treasure2 += 20;
                                treasure3 += 542;
                                //Thread.sleep(500);
                                System.out.print("battle: " + encounter);
                                System.out.println("\t" + "health" + "\t" + "treasure");
                                System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
                                System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
                                System.out.println("");
                                //break;
                                }
                health1 -= 5;
		health2 -= 5;
                health3 -= 5;
		treasure1 -= 5;
		treasure2 -= 5;
                treasure3 -= 5;
                //give a bonus for surviving
	        if (encounter == 5 && bonus == 0 && role >= 'a' && role <= 'm')
                //if I am player1  
                {
                    health1 += 30;
                    treasure1 += 30;
                    bonus = 1;
                    System.out.println("good job, "+ player1);
                    System.out.println("You win bonus health and wealth");
                    System.out.println("You survived many battles");
                    System.out.println("You get 30 extra health and gold. your current totals are:");
                    System.out.println(health1 + " health, and " +treasure1 +" treasure.");
                    System.out.println(" ");
                    health1 += 30;
                    treasure1 += 30;
                    bonus = 1;
                    }
                if (encounter == 5 && bonus == 0 && role >= 'n' && role <= 'z')
                //if I am player2    
                {
                    health2 += 30;
                    treasure2 += 30;
                    bonus = 1;
                    System.out.println("good job, "+ player2);
                    System.out.println("You win bonus health and wealth");
                    System.out.println("You survived many battles");
                    System.out.println("You get 30 extra health and gold. your current totals are:");
                    System.out.println(health2 + " health, and " +treasure2 +" treasure.");
                    System.out.println(" ");
                    health1 += 30;
                    treasure1 += 30;
                    bonus = 1;
                    }
                // here comes The Spoiler:
                //there must be a more compact way of coding this...
                if (health1 > health2 && role >= 'a' && role <= 'm')
                    {
                    health2 += health3;
                    System.out.println("The spoiler gave Professor Papademas "+ health3 + " hit points, so now he has: "+ health2);
                    }
                    else if (health1 > health2 && role >= 'n' && role <= 'z')
                        {
                        health2 += health3;
                        System.out.println("The spoiler gave Colby "+ health3 + " hit points, so now he has: "+ health2);
                        }
                    else if (health1 < health2 && role >= 'a' && role <= 'm')
                        {
                        health1 += health3;
                        System.out.println("The spoiler gave  Colby "+ health3 + " hit points, so now he has: "+ health1);
                        }
                    else if (health1 < health2 && role >= 'n' && role <= 'z')
                        {
                        health1 += health3;
                        System.out.println("The spoiler gave Professor Papademas "+ health3 + " hit points, so now he has: "+ health1);
                        }
		if (health1 <= 0 || health2 <= 0 || treasure1 <= 0 || treasure2 <= 0)
	            {
                    System.out.println(" ");
		    System.out.print("encounter: " + encounter + " action status: ");
	            break;
		     }
		}
		System.out.println("simulation has ended\n");
		System.out.println("results:\n");
		System.out.println("\t\t" + "        health" + "\t" + "treasure");
		System.out.println(player1 + "\t" + health1 + "\t" + treasure1);

		System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
	}
}
