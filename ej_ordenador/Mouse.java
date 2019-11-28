package ej_ordenador;

/**
 *
 * @author jgarciaodowd
 */
public class Mouse {

    private String type;

    /**
     * ask for the type of mouse
     * construcor with parameters
     * @param type
     */
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * get value of mouse
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set value of mouse
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * constructor without parameters
     */
    public Mouse() {
    }
}
