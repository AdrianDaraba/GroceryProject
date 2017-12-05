package projectGrocery;

public class GroceryItemOrder {
    
    private String groceryItem;
    private int numOfItems;
    private double pricePerUnit; 

    
    
    public GroceryItemOrder(String groceryItem, int numOfItems, double pricePerUnit){
        
        this.groceryItem = groceryItem;
        this.numOfItems = numOfItems;
        this.pricePerUnit = pricePerUnit;
    }
        
    public String getGroceryItem(){
        return groceryItem;
    }
    
    public int getNumOfItems(){
        return numOfItems;
    }
    
    public double getPricePerUnit(){
        return pricePerUnit;
    }
    
    public String toString(){
        return "[ "+groceryItem+", "+numOfItems+", "+pricePerUnit+" ]\n";
    }
}