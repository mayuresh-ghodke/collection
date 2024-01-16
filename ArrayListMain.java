import java.util.*;  
 public class ArrayListMain
 {  
 public static void main(String args[])
 {  
	 ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
	 
	 ArrayList<String> color=new ArrayList<String>();
	 
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");
      list.add(2,"Strawberry");//[Mango, Apple, Strawberry, Banana, Grapes]
      list.remove(3);     
      color.add("Yellow");
 	  color.add("pink");
 	  color.add("blue");
      
      if(list.addAll(color) == true) {
    	  System.out.println("Collection object color is added to list.");
      }
         
      //Printing the arraylist object   
      System.out.println("Elements: "+list);  
      System.out.println("Size: "+list.size());

      if(list.isEmpty()){
        System.out.println(list.getClass()+" is empty");
      }
      else{
        System.out.println(list.getClass()+" is not empty");
      }
 }  
}  