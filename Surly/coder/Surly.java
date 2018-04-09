import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Object;


public class Surly{

    //list of variables in used throughtout

    public static  String CLINE = "MySurly>";
    public static  String command = "";
    public static String Helper="HELP ME";
    public String values;
    public static String fileName;
    public static String attributes;
    public static String relName;
    public static String lrelName;
    public static String prelName;
    public static String relation = null;
    public static String col1;
    public static String col2;
    public static String col3;
    public static String col4;
    public static String col5;
    public static String col6;
    public static String col7;
    public static String brack;
    public static String tName;
    public static String attName;
    public static String brak;
    public static String returns;
    public static String relNum;
    public static int size;
    public static int realSize;
    public static int shower;
    public static String shower1;
    public static int counter;
    public static Scanner sc;
    public static String on;
    public static String table;
    public static String order;
    public static String obracket;
    public static String field1;
    public static String field2;
    public static String cbracket;
    public static String storage;
    public static String structure;
    public static String tree;
    public static String indexe; 
    public static String indexName; 
    public static String returnes;
    public static String proj;
    public static String pField;
    public static String from;
    public static String Rel;
    public static String com;
    
		public static String rel1;
		public static String rel2;
		public static String att1;
		public static String att2;
		public static String att3;
		public static String att4;
		
		public static String newRel;	         
		public static String combine;


    public static LinkedList<String> list = new LinkedList<String>();
    public static LinkedList<String> attList = new LinkedList<String>();
    public static ArrayList <String> tuple = new ArrayList<String>();
    public static ArrayList <String> tuple1 = new ArrayList<String>();	
    public static ArrayList <String> column = new ArrayList<String>();
    public static HashMap <String, String> index = new HashMap<String, String>();
    public static List <String> sublister;
    public static List <String> subber;
    public static List <String> sublister1;
    public static List <String> sublister2;
       
    public static void main(String[] args)throws IOException{
          fileName ="";
        if(args.length > 0){
            
            fileName = args[0];
            System.out.println("Welcome to the squirrel's version of surly.");
            System.out.println("Reading from file, "+ args[0] +" please wait...");
            
            System.out.println("If you need any help, please type "+Helper+" and help will be on the way.");
            
            
            
        }


        Scanner s = new Scanner(new FileInputStream(fileName));
	
                
			while(s.hasNextLine()){
	if(s.next().equalsIgnoreCase("RELATION")){
			String relName = s.next();						
			list.add(relName);
											
}				
	}
		s.close();

Scanner sca = new Scanner(new FileInputStream(fileName)); 

                      		while(sca.hasNextLine()){

						if(sca.hasNext()){
							attributes = sca.next();
							attList.add(attributes);
					}				
						attList.remove("RELATION");
						attList.remove(")");
						attList.remove(");");						
						attList.remove("(");
		} 		
		 	
       				sca.close();
           			
				

	
 if(!list.isEmpty() && !attList.isEmpty()){
				
				System.out.println("**** All Relation names and Attributes have been successfully read from "+ fileName+" ****");
				System.out.println("Please begin to input commands.\r");
  }else{System.out.println("One of the datastructures is not well-formed. Need to take a look.");}
	
	  while(true){

	System.out.print(CLINE); //commandline prompt
  		commandline();
		
			// test cases for lexical analysis		

		if (command.equalsIgnoreCase("kill")){
				endSurlyExperience();
			}
		else{ if(command.equalsIgnoreCase("destroy")){ Destroy.destroy();}
				
		}
			if(command.equalsIgnoreCase("insert")){ Insert.insert();}

			if(command.equalsIgnoreCase("print")){ getColumns(); Print.print();}	
			
			if(command.equalsIgnoreCase("delete")){ Delete.delete();}

			
			if(command.equalsIgnoreCase("project")){ proCommand(); Project.project(); }
			
			if(command.equalsIgnoreCase("index")){ index();}
			
			if(command.equalsIgnoreCase("export")){ Export.export(); }


			if(command.equalsIgnoreCase("import")){ memReader(); }

			
			if(command.equalsIgnoreCase("JOIN")){ Join.join(); }

			if(command.equalsIgnoreCase("help")){ helper(); }

			if(command.equalsIgnoreCase("DESCRIBE")){ describe(); }
					
	}


}     
		//method for building columns

		public static void getColumns() throws FileNotFoundException{
	Scanner scac = new Scanner(new FileInputStream("xanadu.txt"));

	while(scac.hasNext()){
	
		  column.add(scac.next().trim());			  	
		
	}
     
		while(column.contains("RELATION")){column.remove("RELATION");} //test to see if word in argument file equals Relation
		while(column.contains("(")){column.remove("(");}            	//rest of code formats the list to get the right format for the columns
    		while(column.contains("CHAR")){column.remove("CHAR");}
		while(column.contains("NUM")){column.remove("NUM");}
		while(column.contains("8")){column.remove("8");}
		while(column.contains("30")){column.remove("30");}
		while(column.contains("4")){column.remove("4");}
		while(column.contains(")")){column.remove(")");}
		while(column.contains("5")){column.remove("5");}
		while(column.contains("10")){column.remove("10");}		
		while(column.contains("20")){column.remove("20");}

		while(column.contains(";")){column.remove(";");}
		
		
		
	      
			
			int num = column.indexOf(lrelName); // obtains position of relation in column list
				
			
			col1 = column.get(num + 1);        // increments integer to get rest of columns
			col2 = column.get(num + 2);
			col3 = column.get(num + 3);				
			col4 = column.get(num + 4);	
			col5 = column.get(num + 5);
			col6 = column.get(num + 6);
			col7 = column.get(num + 7);
				
				if(list.contains(col1)){ // control code for formatting what is to be printed in the table
			        col1 = null; 
				col2 = null;
				col3 = null;				
				col4 = null;	
				col5 = null;	
				col6 = null;
				col7 = null;


		}else if(list.contains(col2)){
				col2 = null;
				col3 = null;				
				col4 = null;	
				col5 = null;
				col6 = null;
				col7 = null;

	}else if(list.contains(col3)){
				
			col3 = null;
			col4 = null;	
			col5 = null;
			col6 = null;
			col7 = null;

			}else if(list.contains(col4)){
				col4 = null;
				col5 = null;
				col6 = null;
				col7 = null;
			}else if(list.contains(col5)){
				col5 = null;
				col6 = null;
				col7 = null;
			}else if(list.contains(col6)){
				col6 = null;
				col7 = null;
				}else if(list.contains(col7)){
				
				col7 = null;
				}	
				
			
}





		//commandline method, used to read commandline inputs

		public static void commandline(){
		sc = new Scanner(System.in);
	
        command = sc.next().trim();
		
	lrelName = sc.next().trim();
	
		 
	
		
        sc.useDelimiter(";");


}

	public static void proCommand(){  // project commandline method, used to read commandline inputs for project
		      System.out.print(CLINE);
			Scanner pScanner = new Scanner(System.in);
				 proj = pScanner.next().trim();
				if(proj.equalsIgnoreCase("project")){
				 pField = pScanner.next().trim();
				from = pScanner.next().trim();
				Rel = pScanner.next().trim();
		}

	}




	public static void index(){
		System.out.print(CLINE);
				Scanner cScanner = new Scanner(System.in);
					String com = cScanner.next().trim();
					if(com.equalsIgnoreCase("INDEX")){
						String indexName = cScanner.next().trim();
						
					String on = cScanner.next().trim();
					String table = cScanner.next().trim();
					String order = cScanner.next().trim();
					String obracket = cScanner.next().trim();
					String field1 = cScanner.next().trim();
					String field2 = cScanner.next().trim();
					String cbracket = cScanner.next().trim();
					String storage = cScanner.next().trim();
					String structure = cScanner.next().trim();
					String tree = cScanner.next().trim();
					size = tuple.size();
					shower = column.indexOf(table); 
					counter = column.indexOf(field2);
					int counter1 = counter + 1 ;
					shower1 = column.get(counter);
					sublister = column.subList(shower, counter1);
					realSize = (size/2);
					if(list.contains(table)){
					if(attList.contains(field1) && attList.contains(field2)){
							int inte = sublister.indexOf(field1);							
							int inter = sublister.indexOf(field2);
							String strang = tuple.toString();
							Scanner sScanner = new Scanner(strang);
							while(sScanner.hasNext()){tuple1.add(sScanner.next().trim()); tuple1.remove(";]"); tuple1.remove(";"); tuple1.remove(";,"); tuple1.remove(",");}							
							int sizer = tuple1.size();
							 
							for(int i=1; i<(sizer + 1); i++){																					
							String index1 = tuple1.get(inte);
							String index2 = tuple1.get(inter);
							combine = (index1+" "+index2);
							index.put(table, combine);
						}
						
					
						
					System.out.println("This is the index on relation "+table);	
					System.out.println(index);
					
	}
}else {System.out.println("The Relation name given above is wrong or does not exist. Please verify the name or check that the name is in uppercase letters. Thanks!!");	}
					
					
			}
					
				
	}





  public static void memReader() throws FileNotFoundException{
		Scanner merm = new Scanner(new FileInputStream("export.xml"));
		if(merm.hasNext()){

		System.out.println("File found!!");
		System.out.println("Ready to read contents into memory.");
		merm.close();
	}
	}

	

		public static void jCommand(){  // join commandline method, used to read commandline inputs for join command
		System.out.print(CLINE);

		Scanner jScanner = new Scanner(System.in);
				String join = jScanner.next().trim();
				if(join.equalsIgnoreCase("JOIN")){						
				rel1 = jScanner.next().trim();
				rel2 = jScanner.next().trim();
				att1 = jScanner.next().trim();
				att2 = jScanner.next().trim();
				att3 = jScanner.next().trim();
				att4 = jScanner.next().trim();
				returnes = jScanner.next().trim();
				newRel = jScanner.next().trim();	

			}
		
		}


      
  // control method for ending surly
public static void endSurlyExperience(){
        System.out.println("Thanks for putting my Surly to the test.");
        System.out.println("Bye Bye");
        System.exit(0);
        
    }
		


		// method to print the help file to screen to aid user 
		public static void helper()throws FileNotFoundException{

			Scanner helpScanner = new Scanner(new FileInputStream("help.txt"));

		while(helpScanner.hasNext()){
		System.out.println(helpScanner.next());
		helpScanner.useDelimiter(";");
}
		
		
	}




		
			public static void describe(){ //used to help user have an idea of database state
			
			System.out.println("This is the list of relations currently available in Surly.");
			System.out.println(list);
			if(!column.isEmpty()){
			System.out.println("The following describes the fields in each of the relations.");
			System.out.println(column);

}else{System.out.println("Sorry but columns for relations have not been read yet. Please initiate the print command to get all columns read and then you can view the column structure for above relations. Thanks.");}

		}
		
}