package ej_ordenador;

/**
 *
 * @author jgarciaodowd
 */
public class Screen {

    private String Brand;
    private float Inch;

    /**
     * constructor with parameters
     * @param brand 
     * @param inch 
     */
    public Screen(String brand, float inch) {
        this.Brand = brand;
        this.Inch = inch;
    }

    /**
     * get value of brand
     * @return Brand 
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * set value of brand
     * @param Brand
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * get the value of inches
     * @return inch
     */
    public float getInch() {
        return Inch;
    }

    /**
     * set value of inches
     * @param Inch
     */
    public void setInch(float Inch) {
        this.Inch = Inch;
    }

    /**
     * constructor without parameters
     */
    public Screen() {
    }
}
