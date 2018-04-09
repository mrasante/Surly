
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

public class Relation{
    public static  String CLINE = "MySurly>";
    public static  String command = "";
    public static String Helper="HELP";
    public static String values;
    public static String relName;
    public static int size;
    public static int realSize;
    public static int shower;
    public static String shower1;
    public static int counter;


    public static String attributes;
    public static String prelName;
    public static String relation = null;
    public static String col1;
    public static String col2;
    public static String col3;
    public static String col4;
    public static String col5;
    public static String col6;
    public static String col7;
		    
    public static String lrelName = null;
    public static String indexName;        


    public static int charLength, numLength;
    public static LinkedList<String> list = new LinkedList<String>();
    public static LinkedList<String> attList = new LinkedList<String>();
    public static ArrayList <String> tuple = new ArrayList<String>();
    public static ArrayList <String> tuple1 = new ArrayList<String>();	
    public static ArrayList <String> tuple2 = new ArrayList<String>();
    public static LinkedList <String> column = new LinkedList<String>();
    public static List <String> sublister;
    public static List <String> sublister1;
    public static HashMap <String, String> index = new HashMap<String, String>();
    public static String columns;
		
    public static void main(String[] args)throws IOException{
         
        if(args.length > 0){
            
            
            System.out.println("Welcome to the squirrel's version of surly.\r");
            System.out.println("Reading from file, "+ args[0] +" please wait...");
            
            System.out.println("If you need any help, please type "+Helper+" and help will be on the way.");
            System.out.println("Surly read the following contents from file "+ args[0] + "\r");
            
            String fileName = args[0];
       
        Scanner s = new Scanner(new FileInputStream(fileName));
	
                
			while(s.hasNextLine()){
	if(s.next().equalsIgnoreCase("RELATION")){
			String relName = s.next();						
			list.add(relName);
											
}						
		
}System.out.println("This is the list of the Relations.");
			System.out.println(list);			

s.useDelimiter(";");			
	

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
						attList.remove(relName);
						attList.remove("(");

		} 

                 
		
		 System.out.println("This is the list of relations and their specific structure.");		
		 System.out.println(attList);	
		getColumns();
		insert();
			

		
          		 
	
       
           }

    Scanner scanner = new Scanner(System.in);

	command = scanner.next().trim();
	lrelName = scanner.next().trim();
	
		
		if(command.equalsIgnoreCase("print")){
		
		
		scanner.close();
		getColumns();
		insert();
		
		print();
		
	}else{ if(command.equalsIgnoreCase("insert")){ insert();}
		else{ if(command.equalsIgnoreCase("INDEX")){ index();}}
		
}
    }


	public static void getColumns() throws FileNotFoundException{
	Scanner scac = new Scanner(new FileInputStream("xanadu.txt"));

	while(scac.hasNext()){
	
		  column.add(scac.next().trim());			  	
		
	}
     
		while(column.contains("RELATION")){column.remove("RELATION");}
		while(column.contains("(")){column.remove("(");}
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
		System.out.println(column);
		
	      
			
			int num = column.indexOf(lrelName);
			
			col1 = column.get(num + 1);
			col2 = column.get(num + 2);
			col3 = column.get(num + 3);				
			col4 = column.get(num + 4);	
			col5 = column.get(num + 5);
			col6 = column.get(num + 6);
			col7 = column.get(num + 7);
				
				if(list.contains(col1)){
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
		System.out.println(column);
			
}


		public static void destroy(){
			if(command.equalsIgnoreCase("DESTROY")){
				if(!list.contains(lrelName)){System.out.println("The Relation in the command does not exist. Please check and try again.");
			}else{list.remove(lrelName);
			       				}
			if(attList.contains(lrelName)){
				int holder = attList.indexOf(lrelName);
				while(!list.contains(attList.get(holder++))){
					String candidate = attList.get(holder++);
						attList.remove(lrelName);
						attList.remove(candidate);

					}	
				 
		}

		}
			if(!list.contains(lrelName) && !attList.contains(lrelName)){
					System.out.println("The specified relation and its attributes have been successfully deleted!!!");
			 }else{System.out.println("The Destroy command could not be executed. There is something wrong with the command synthax, please check and try again.");}
		}


   public static void insert() throws FileNotFoundException{
	
         
        Scanner scan = new Scanner(new FileInputStream("insert.txt"));
	

	while(scan.hasNext()){
			if(scan.next().trim().equalsIgnoreCase("INSERT")){
					
						relation = scan.next();	
					if(list.contains(relation)){						
					tuple.add(relation);
					
					tuple.add(scan.nextLine());
						System.out.println("All records in file insert.txt successfully added!!");
							
						}else{System.out.println("The specified relation does not exist. Command Aborted.");}
				}
				
					
		}
			
			

	} 


		public static void index(){
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
							String combine = (index1+" "+index2);
							index.put(table, combine);
						}
						
					System.out.println(tuple1);
					System.out.println(field1);	
					System.out.println(shower1);	
					System.out.println(index);
					System.out.println(sublister);
	}
}else {System.out.println("The Relation name given above is wrong or does not exist. Please verify the name or check that the name is in uppercase letters. Thanks!!");	}
					
					
			}
					
				
	}


	public static void export()throws IOException{
			Scanner exporter = new Scanner(System.in);
				String tester = exporter.next().trim();
				
			if(tester.equalsIgnoreCase("EXPORT")){

			String name = exporter.next().trim();
					PrintWriter writer = new PrintWriter(new FileWriter("export.xml"));
						String version = "1.0"; String encode = "ISO-8859-1";
					writer.println("<?xml version="+version+" encoding="+encode+"?>");
					writer.println("<exporter>");
					writer.println("<relation>"+ name +"</relation>");
					writer.println("</exporter>");
					writer.println();
					writer.close();
				System.out.println("Printed Successfully.!!");
		}else {System.out.println("I couldnt print.");}
			
			}
		


		public static void project(){
			Scanner pScanner = new Scanner(System.in);
				String proj = pScanner.next().trim();
				String pField = pScanner.next().trim();
				String from = pScanner.next().trim();
				String Rel = pScanner.next().trim();
			if(list.contains(Rel)){
				
			int getter = list.indexOf(Rel);	
				String nexterRel = list.get(getter + 1);
				int nextGetter = column.indexOf(nexterRel);
				sublister1 = column.subList(getter, nextGetter);
				int indent = sublister.indexOf(pField);
				String strange = tuple.toString();
				Scanner psScanner = new Scanner(strange);
				while(psScanner.hasNext()){tuple2.add(psScanner.next().trim()); tuple2.remove(";]"); tuple2.remove(";"); tuple2.remove(";,"); tuple1.remove(",");}							
				int sizer = tuple1.size();
							 
				
				for(int i=1; i<(sizer + 1); i++){																																
				String projector = tuple2.get(indent);

				System.out.println("+------------------+");
				System.out.println("	"+pField+"	");	
				System.out.println("+------------------+");
				System.out.println("	"+projector+"	");
				System.out.println("+------------------+");
	}
			
	}

}






	 

  public static void print() throws FileNotFoundException{
 		
		
				
				
	if(list.contains(lrelName)){
	     System.out.println("+ -------------------------------+");
	     System.out.println("|"+"		"+lrelName+"		"+"|");	
	     System.out.println("+ -------------------------------+");
	     System.out.println("| "+col1+" "+col2+" "+col3+" "+col4+" "+col5+" "+col6+" "+col7+" |");
	     System.out.println("+ -------------------------------+");

		}
  		if(tuple.contains(lrelName)){
			int numb = tuple.indexOf(lrelName);
			String row = tuple.get(numb + 1);
			System.out.println("|"+ row + "|");
		}
		

				

	 else{System.out.println("Come on man, be serious check your relation before asking me to work on it. I dont have it.");}

			
}


    public static void endSurlyExperience(){
        System.out.println("Thanks for putting my Surly to the test.");
        System.out.println("Bye Bye");
        System.exit(0);
        
    }

}
