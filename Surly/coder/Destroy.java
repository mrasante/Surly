



public class Destroy extends Surly{



  
		
	public static void destroy() {
			if(command.equalsIgnoreCase("DESTROY")){
				if(!list.contains(lrelName)){System.out.println("The Relation in the command does not exist. Please check and try again.");
			}else{list.remove(lrelName);
			       				}
			if(attList.contains(lrelName)){
				int holder = attList.indexOf(lrelName);
				while(!list.contains(attList.get(holder))){
					String candidate = attList.get(holder);
						
						attList.remove(candidate);
						tuple.remove(lrelName);

					}	
				 attList.remove(lrelName);
		}

		}
			if(!list.contains(lrelName) && !attList.contains(lrelName)){
					
					System.out.println("The specified relation and its attributes have been successfully deleted!!!");
			 }else{System.out.println("The Destroy command could not be executed. There is something wrong with the command synthax, please check and try again.");}
		}
	
	


}