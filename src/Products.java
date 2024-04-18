public class Products {
    private String Price;
    private String Product_Name;

    private String Product_Code;

    private String Expiration_Date;

    private String Brand;

    private String Corridor;

    public Products(String price, String product_Name, String product_Code, String expiration_Date, String brand, String Corridor) {
        this.Price = price;
        this.Product_Name = product_Name;
        this.Product_Code = product_Code;
        this.Expiration_Date = expiration_Date;
        this.Brand = brand;
        this.Corridor = Corridor;
    }

    public String getCorridor() {
        return Corridor;
    }

    public String getPrice() {
        return Price;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public String getProduct_Code() {
        return Product_Code;
    }

    public String getExpiration_Date() {
        return Expiration_Date;
    }

    public String getBrand() {
        return Brand;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public void setProduct_Code(String product_Code) {
        Product_Code = product_Code;
    }

    public void setExpiration_Date(String expiration_Date) {
        Expiration_Date = expiration_Date;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setCorridor(String corridor) {
        Corridor = corridor;
    }
}
