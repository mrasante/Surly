import java.io.*;
import java.io.IOException;
import java.util.*;
import java.lang.Object;





  public class Insert extends Surly{


		public static String relaName;

		public static void insert() throws FileNotFoundException{
	
          
        Scanner scan = new Scanner(new FileInputStream("insert.txt"));
	Scanner scane = new Scanner(new FileInputStream("insert.txt"));
	 while(scane.hasNext()){
			if(scane.next().trim().equalsIgnoreCase("INSERT")){
				relaName = scane.next().trim();
					if(list.contains(lrelName)){
					System.out.println("Relation found, going ahead to insert tuple. Please wait .....");
					System.out.println("Alls values successfully inserted into "+lrelName);
			}else{System.out.println("The Relation in the command does not exist. Command Aborted.");}									         		


		}

	}
		scane.close();

	while(scan.hasNext()){
			if(scan.next().trim().equalsIgnoreCase("INSERT")){
					
						relation = scan.next();	
					if(list.contains(relation)){						
					tuple.add(relation);
					
					tuple.add(scan.nextLine());
						
							
						}
				}
				
					
		}
			scan.close();
			
			
	} 

 }