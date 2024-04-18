public class Suco extends Products{

    private String Sabor_Suco;

    private boolean Suco_Gelado;

    private String Litros;

    public Suco(String price, String product_Name, String product_Code, String expiration_Date, String brand, String Corridor, String Sabo_Suco, boolean Suco_Gelado, String Litros) {
        super(price, product_Name, product_Code, expiration_Date, brand, Corridor);
        this.Litros=Litros;
        this.Sabor_Suco=Sabo_Suco;
        this.Suco_Gelado=Suco_Gelado;
    }

    public String getSabor_Suco() {
        return Sabor_Suco;
    }

    public boolean isSuco_Gelado() {
        return Suco_Gelado;
    }

    public String getLitros() {
        return Litros;
    }

    public void setSabor_Suco(String sabor_Suco) {
        Sabor_Suco = sabor_Suco;
    }

    public void setSuco_Gelado(boolean suco_Gelado) {
        Suco_Gelado = suco_Gelado;
    }

    public void setLitros(String litros) {
        Litros = litros;
    }
}
