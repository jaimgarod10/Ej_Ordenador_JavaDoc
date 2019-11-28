package ej_ordenador;

/**
 *
 * @author jgarciaodowd
 */
public class CPU {

    private int velocidad;
    private int memoria;

    /**
     *
     * @param velocidad 
     * @param memoria almacenamiento
     */
    public CPU(int velocidad, int memoria) {
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    /**
     *
     * @return
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     *
     * @param velocidad
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     *
     * @return
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     *
     * @param memoria
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * constructor sin parámetros
     */
    public CPU() {
    }
}
