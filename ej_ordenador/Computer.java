package ej_ordenador;

/**
 *
 * @author jgarciaodowd
 */
public class Computer {

    private Mouse Mouse = new Mouse();
    private Screen screen = new Screen();
    private CPU cpu = new CPU();

    /**
     * declaration of attributes
     */
    public Computer() {
    }

    /**
     * Constructor with parameters
     * @param mouse
     * @param screen
     * @param cpu
     */
    public Computer(Mouse mouse, Screen screen, CPU cpu) {
        this.Mouse = mouse;
        this.screen = screen;
        this.cpu = cpu;
    }

    /**
     * get the values of mouse
     * @return
     */
    public Mouse getRato() {
        return Mouse;
    }

    /**
     * set the value to mouse
     * @param mouse
     */
    public void setRato(Mouse mouse) {
        this.Mouse = mouse;
    }

    /**
     * get the value of screen
     * @return
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     *set values to screen
     * @param screen
     */
    public void setScreen(Screen screen) {
        this.screen= screen;
    }

    /**
     * get values of cpu
     * @return
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * set values of cpu
     * @param cpu
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    /**
     * show everything
     */
    public void amosar() {
        System.out.println("Tipo do rato: " + Mouse.getType()
                + "\nMarca da pantalla: " + screen.getBrand()
                + "\nPulgadas da pantalla: " + screen.getInch()
                + "\nMemoria da CPU: " + cpu.getMemoria()
                + "\nVelocidade da CPU: " + cpu.getVelocidad());
    }

}
