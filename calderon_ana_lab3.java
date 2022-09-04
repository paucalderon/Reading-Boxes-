
/* Description: 
 * 1. Complete the Box file
 * 		a. Complete the constructors
 * 		b. Write down the set and get methods for variables
 * 2. Read the boxfile.txt using scanner
 * 3. First line of the file contains how many boxes are there
 * 4. Following N rows contains length, width, height of each boxes
 * 5. Create Box class Array 
 * 6. Store all the rows in the Box class array using get set method
 * 
 * 7. Find the box with maximum length
 * 8. Find the box with minimum length
 * 9. Compute volume of each boxes and print that
 * 10. Find the box with max volume 
 * 11. Find the box with min volume
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class calderon_ana_lab3 {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("/Users/paulinacalderon/Desktop/CS2/boxfile.txt");
        //Creating Scanner instnace to read File
        Scanner scnr = new Scanner(file);
        
	      
	      // First line of text file that give us the number of boxes
	      String n_str = scnr.nextLine();
	      int n = Integer.parseInt(n_str);
	      
	      // Box class Array
	      Box boxes[] = new Box[n];
	      // Scanning each row of the text file and making boxes with the len,width,height values
	      int i = 0;
	      while(i<n){
	          String line = scnr.nextLine();
	          Box box = new Box();
	          String items[] = line.split(" ");
	          // This line will not acceptable for your lab
	          // You are supposed to write a set method to set value of each variable of the box
	          //creates string into doubles
	          box.setLength(Double.parseDouble(items[0]));
	          box.setWidth(Double.parseDouble(items[1]));
	          box.setHeight(Double.parseDouble(items[2]));
	          boxes[i]=box;
	          i++;

	      } 
	      // You need to use get method to access the variables
	      for(int j=0; j<n; j++) {
	    	  System.out.println("Box number "+(j+1)+
	    			  "\nlength: "+boxes[j].getLength()+
	    			  "\nwidth "+boxes[j].getWidth()+
	    			  "\nheight "+boxes[j].getHeight()+
	    			  "\nvolume "+boxes[j].getVolume());
	      }
	      //calls max and min methods
	      System.out.println("The biggest length is " + getMaxLength(boxes).getLength());
	      System.out.println("The smallest length is " + getMinLength(boxes).getLength());
	      System.out.println("The biggest volume is " + getMaxVolume(boxes).getVolume());
	      System.out.println("The smallest volume is " + getMinVolume(boxes).getVolume());
	}
	//gets max length from the boxes
	public static Box getMaxLength(Box[] boxes) {
		int res = 0;
		double maxLength = -Integer.MAX_VALUE;

		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].getLength()>maxLength){
				maxLength = boxes[i].getLength();
				res = i;
			}
		
		}	

		return boxes[res];
	}
	//gets min length from the boxes
	public static Box getMinLength(Box[] boxes) {
		int res = 0;
		double minLength = Integer.MAX_VALUE;

		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].getLength() <minLength){
				minLength = boxes[i].getLength();
				res = i;
			}
		
		}
		
		return boxes[res];
	}
	//gets max volume from the boxes
	public static Box getMaxVolume(Box[] boxes) {
		int res=0;
		double maxVolume = -Integer.MAX_VALUE;

		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].getVolume()>maxVolume){
				maxVolume = boxes[i].getVolume();
				res = i;
			}
		
		}	
		
		return boxes[res];
	}
	//gets min volume from the boxes
	public static Box getMinVolume(Box[] boxes) {
		int res=0;
		double minVolume = Integer.MAX_VALUE;

		for(int i = 0; i < boxes.length; i++){
			if(boxes[i].getVolume() < minVolume){
				minVolume = boxes[i].getVolume();
				res = i;
			}
		
		}
		return boxes[res];
	}

}
