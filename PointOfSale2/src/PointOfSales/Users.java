
package PointOfSales;

public class Users {
    private int id;
    private int productid;
    private String name;
    private int stock;
    private int price;
    private String category;
    
    public Users(int ID, int ProductID, String Name, int Stock, int Price, String Category){
        this.id=ID;
        this.productid=ProductID;
        this.name=Name;
        this.stock=Stock; 
        this.price=Price;
        this.category=Category;
    }

    Users(int aInt, String string, int aInt0, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getID(){
        return id;
    }
    public int getProductID(){
        return productid;
    }
    public String getName(){
        return name;
    }
    public int getStock(){
        return stock;
    }
    public int getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
}
