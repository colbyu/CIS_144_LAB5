/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Random;
public class Battles {
    // initial health and treasures for the two players
	int number = 0, forrestry = 0,bonus = 0, cloaked = 0, mission = 0, health1 = 100, health2 = 100, health3 = 100;
	int treasure1 = 100, treasure2 = 100, treasure3 = 100, encounter = 0;
	
   for (encounter = 1; encounter <= 20; encounter++)
		{
                letter = (char)(rand1.nextInt(3) + 'a');
		number = rand2.nextInt(10) + 1;
		// randomly encounter the enemy
		if(letter == 'a' || letter == 'b')
		//if(mission == 1 || mission == 2 || mission == 3)
                    if (forrestry == 1)
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
			    System.out.println("\t" + "health" + "\t" + "treasure");
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
                            System.out.println("\t" + "health" + "\t" + "treasure");
                            System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
                            System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
                            System.out.println("");
                            //break;
                            }
                        else if(letter == 'd')
                            {
                            health1 = 0;
                            health2 = 0;
                            System.out.println("You have died of dysentery :(");
                            //Thread.sleep(500);
                            System.out.print("battle: " + encounter);
                            System.out.println("\t" + "health" + "\t" + "treasure");
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