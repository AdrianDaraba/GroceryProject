package projectGrocery;

import java.util.Arrays;

public class main {     
   
    public static void main(String[] args) {        
        //String[] shoppingList = new String[10];        
     
    	System.out.println("Create a grocery list ");
    	GroceryList gList = new GroceryList();
    	
    	GroceryItemOrder banana = new GroceryItemOrder("banana", 3, 2.5);
    	GroceryItemOrder beans = new GroceryItemOrder("beans", 10, 3.5);
    	
    	gList.add(beans);
    	for(int i = 0; i < 10; i++) {
    		gList.add(banana);
    	}
    	gList.add(beans);
    	
    	gList.printShoppingList();
    }    
}