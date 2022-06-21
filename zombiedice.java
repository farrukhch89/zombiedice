import java.util.*;
class dicededuce{
	public static void main(String [] args){
		// completed by Farrukh
		System.out.println();
		System.out.println();
		System.out.println("                *********************************");
		System.out.println("                **                             **");
		System.out.println("                ** WELCOME TO ZOMBIE DICE GAME **");
		System.out.println("                **                             **");
		System.out.println("                *********************************");
		System.out.println();
		
		player();
		
	}
	public static void player(){
		// completed by Farrukh
		Scanner kb = new Scanner (System.in);
		int numofplayer = 0;
		int countplayer =0;
			System.out.println("Enter number of players: ");
			numofplayer = kb.nextInt();
			
			int[] playerscore = new int[numofplayer];
			String[] playerName = new String[numofplayer];
			for(int i =0; i< numofplayer; i++){
				System.out.print("Enter player " + i + " name: ");
				playerName[i]= kb.next();
				
				System.out.println();
				
			}
			while (countplayer < numofplayer){
			System.out.println();
			System.out.println();
			System.out.println("                 ~~~~~~~ PLAYER " +countplayer+ " ~~~~~~~");
			dice();
			countplayer++;
			}
			
	}	
	public static void dice(){
		//completed by Khusmanda
		
			Scanner kb = new Scanner (System.in);
			String s = "";
			int[] dice = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3};
			int counter = 0; // shift from one dice to the other
			int countred = 3;// total red left in cup
			int countyellow = 4;// total yellow in cup
			int countgreen = 6;// total green left in cup
			int total = 0; // total left in cup
			int result = 0; // result of thrown dice
			int tempShot = 0; // store shot
			int tempbrain = 0; // store brain
			int tempFoot = 0; // store footprint
			int Shot = 0; // accumulate Shot
			int Brain = 0; // accumulate Brain
			int totalbrain = 0;
			int redfoot = 0;
			int yellowfoot = 0;
			int greenfoot = 0;
			int t = 3;// decreasing dice from 3 to 2 or 1 when using footprint
	
			Random r = new Random();
			// 1 = red dice
			// 2 = yellow dice
			// 3 = green dice
		
		System.out.println();
		System.out.println("PRESS ENTER PICK AND ROLL  DICE");
		s = kb.nextLine();
		System.out.println();
		
		while(counter < t){
			int k = (int)(Math.random()*dice.length);
			if (dice[k] == 1){ // dice is red
				for (int i = 0; i < 1; i++){ // roll to find the picture
					result = r.nextInt(6);
					result++;
					
					if(result == 1 || result == 2 || result == 3){ // red dice
						System.out.println("           +++++  RED DICE && SHOT       +++++");
						tempShot++;
					}
					else if(result == 4 || result == 5){
						System.out.println("           +++++  RED DICE && FOOTPRINT  +++++");
						tempFoot++;
						redfoot++;
					}
					else if(result == 6){
						System.out.println("           +++++  RED DICE && BRAIN      +++++");
						tempbrain++;
					}
				}
				countred--;
			}
			else if (dice[k] == 2){ // dice is yellow
				for (int i = 0; i < 1; i++){ // roll for picture
					result = r.nextInt(6);
					result++;
					
					if(result == 1 || result == 2 ){
						System.out.println("           +++++  YELLOW DICE && SHOT       +++++");
						tempShot++;
					}
					else if(result == 3 || result == 4 ){
						System.out.println("           +++++  YELLOW DICE && FOOTPRINT  +++++ ");
						tempFoot++;
						yellowfoot++;
					}
					else if(result == 5 || result == 6){
						System.out.println("           +++++  YELLOW DICE && BRAIN      +++++");
						tempbrain++;
	
					}
				}
				countyellow--;
			}
			else if (dice[k] == 3){ // dice is green
				for (int i = 0; i < 1; i++){ // roll for picture
					result = r.nextInt(6);
					result++;
					
					if(result == 1){
						System.out.println("           +++++  GREEN DICE && SHOT       +++++");
						tempShot++;
					}
					else if(result == 2 || result == 3){
						System.out.println("           +++++  GREEN DICE && FOOTPRINT  +++++");
						tempFoot++;
						greenfoot++;
					}
					else if(result == 4 || result == 5 || result == 6){
						System.out.println("           +++++  GREEN DICE && BRAIN      +++++");
						tempbrain++;
					}
				}
				countgreen--;
			}
			//System.out.println(countred +" , "+ countyellow + " , " + countgreen);
			 // saving foot
			Shot = tempShot;
			Brain = tempbrain;
			
			
			counter++;
				
			
		}
		System.out.println();
		System.out.println("   -----------------------------------------------------------------");
		System.out.println("||	 FOR THIS TURN YOU HAVE: " + "SHOT = "+ tempShot + ", BRAIN = "+ tempbrain + ", FOOTPRINT = " + tempFoot + " ||");
		System.out.println("|| 	 IN TOTAL YOU HAVE :  " + "SHOT = "+ Shot + ", BRAIN = "+ Brain + " 		    ||");
		System.out.println("   -----------------------------------------------------------------");
		System.out.println();
		
	
		if(Shot == 3){
			tempbrain = 0;
			tempShot = 0;
			System.out.println();
			System.out.println();
			System.out.println("           ~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("           ~~ YOU LOSE THIS TURN ~~");
			System.out.println("           ~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("IN TOTAL YOU HAVE : ~~~~~ " + "BRAIN = "+ Brain + " ~~~~~");
		
			// make array to store data 
		}
	// completed by	Farrukh and Khusmanda
	
		else if (Shot != 3){
			if (tempFoot >= 0){ // if have 1 or more footprint to roll dice again
				System.out.print("Press 'Y' to ROLL dice again or PRESS 'N' to Stop this turn:  ");
				s = kb.nextLine();
				int count = 0;
				char c = s.charAt(count);
					if ( c == 'y' || c == 'Y'){
						if (redfoot >= 1){
							int a = redfoot;
						for (int i = 0; i <= a; i++){ // roll to find the picture
							result = r.nextInt(6);
							result++;
							
							if(result == 1 || result == 2 || result == 3){ // red dice
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  RED DICE && SHOT       +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								tempShot++;
							}
							else if(result == 4 || result == 5){
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  RED DICE && FOOTPRINT  +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								tempFoot++;
								redfoot++;
							}
							else if(result == 6){
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  RED DICE && BRAIN      +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++");
								tempbrain++;
							}
						}
						t = t - a;
						dice();
				
						}
						else if (yellowfoot >= 1){
							int b = yellowfoot;// saving foot
							for (int i = 0; i < b; i++){ // roll for picture
								result = r.nextInt(6);
								result++;
								
								if(result == 1 || result == 2 ){
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									System.out.println("           +++++  YELLOW DICE && SHOT       +++++");
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									tempShot++;
								}
								else if(result == 3 || result == 4 ){
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									System.out.println("           +++++  YELLOW DICE && FOOTPRINT  +++++ ");
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									tempFoot++;
									yellowfoot++;
								}
								else if(result == 5 || result == 6){
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									System.out.println("           +++++  YELLOW DICE && BRAIN      +++++");
									System.out.println("           ++++++++++++++++++++++++++++++++++++++");
									tempbrain++;
				
								}
							}
							t = t - b;
							dice();
						//pick 2 dice and roll
						}
	
						else if (greenfoot >= 1){
							int cf = greenfoot;// saving foot
							for (int i = 0; i < cf; i++){ // roll for picture
							result = r.nextInt(6);
							result++;
							
							if(result == 1){
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  GREEN DICE && SHOT       +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								tempShot++;
							}
							else if(result == 2 || result == 3){
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  GREEN DICE && FOOTPRINT  +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								tempFoot++;
								greenfoot++;
							}
							else if(result == 4 || result == 5 || result == 6){
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								System.out.println("           +++++  GREEN DICE && BRAIN      +++++");
								System.out.println("           +++++++++++++++++++++++++++++++++++++");
								tempbrain++;
							}
						}
						t = t - cf;
						dice();
						// pick 1 dice and roll
						}
						
					}
	// completed by Farrukh
					else if (c == 'n' || c == 'N'){ 
												
						// make array to store data for this player
						Shot = 0;
						System.out.println("IN TOTAL YOU HAVE : ~~~~~ " + "BRAIN = "+ Brain + " ~~~~~");
					
											
					}
					else if (Brain >= 13 && Shot != 3){
						System.out.println("YOU WON");
			
					}
					else  {
							dice();
						// three footprint
					}
					}
				
			
			}

		}

}
// scoring is not working			