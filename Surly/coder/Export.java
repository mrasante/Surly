
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Object;

public class Export extends Surly{


	public static String tupler;
	public static Object inGetter;
  public static void export()throws IOException{
			
				
			if(command.equalsIgnoreCase("EXPORT")){

			        	if(tuple.contains(lrelName)){
						int tuplerge = tuple.indexOf(lrelName);
						tupler = tuple.get(tuplerge + 1);
		}

		      if(!index.isEmpty()){
			inGetter = index.get(1);
	}else{System.out.println("The chosen relation does not have an index.");}
					PrintWriter writer = new PrintWriter(new FileWriter("export.xml"));
						
					writer.println("<?xml version="+"1.0"+" encoding="+"ISO-8859-1"+" ?>");
					writer.println("<exporter>");
					writer.println("<relation>"+ lrelName +"</relation>");
					writer.println("<tuple>"+ tupler +"</tuple>");
					writer.println("<index>"+ combine +"</index>");
					writer.println("</exporter>");
					writer.println();
					writer.close();
				System.out.println("XML file format of "+lrelName+" and its indexes have been printed Successfully.!!");
		}else {System.out.println("Couldnt print to file.");}
			
			}


		
}