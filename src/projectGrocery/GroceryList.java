package projectGrocery;

import java.util.Arrays;

public class GroceryList {

    GroceryItemOrder[] shoppingList;
    int indexGroceries;

    //constructor
    public GroceryList() {    	
    	this.shoppingList = new GroceryItemOrder[10];
    	this.indexGroceries = 0;
    }
    
    //add an item to groceryList
    public void add(GroceryItemOrder item){
    	if(indexGroceries < 9) {
	       this.shoppingList[indexGroceries] = item;   
	       indexGroceries++;
    	}
    }  
    
    
    
    public void printShoppingList() {
    	
    	for(int i = 0; i < shoppingList.length; i++) {
    		if(shoppingList[i] != null) { 			
    			    			
    			System.out.println(shoppingList[i].getGroceryItem()+" " + shoppingList[i].getNumOfItems()+" " + shoppingList[i].getPricePerUnit());
    		}
    	}
    }
    
    
}

