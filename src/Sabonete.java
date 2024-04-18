public class Sabonete extends Products{

    private String Fragrance;
    private String Color_Sabonete;

    public Sabonete(String price, String product_Name, String product_Code, String expiration_Date, String brand, String Corridor, String fragrance, String color_Sabonete) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        this.Fragrance = fragrance;
        this.Color_Sabonete = color_Sabonete;
    }

    public String getFragrance() {
        return Fragrance;
    }

    public String getColor_Sabonete() {
        return Color_Sabonete;
    }

    public void setFragrance(String fragrance) {
        Fragrance = fragrance;
    }

    public void setColor_Sabonete(String color_Sabonete) {
        Color_Sabonete = color_Sabonete;
    }
}
