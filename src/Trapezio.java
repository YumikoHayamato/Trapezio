
/**
 * Classe per il calcolo dell'area del trapezio.
 * 
 * <b>@author Dhaskallo</b>
 * @version 1.0
 */
public class Trapezio {
    private double baseMaggiore;
    /** Base maggiore del trapezio */
    private double baseMinore;
    /** Base minore del trapezio */
    private double altezza;
    /** Altezza del trapezio */

    public Trapezio(double baseMaggiore, double baseMinore, double altezza) {
        this.baseMaggiore = baseMaggiore;
        this.baseMinore = baseMinore;
        this.altezza = altezza;
    }
    /**
     * Costruttore della classe Trapezio.
     * @param B base maggiore del trapezio
     * @param b base minore del trapezio
     * @param h altezza del trapezio
     */

    public double calcolaArea() {
        return (baseMaggiore + baseMinore) * altezza / 2;
    }
    /**
     * <u>Calcola l'area del trapezio.</u>
     * @return area del trapezio
     */

    public static void main(String[] args) {
        Trapezio t1 = new Trapezio(3,2,1);
        double area = t1.calcolaArea();
        System.out.println("L'area del trapezio è: " + area);
        t1 = new Trapezio(6,5,5);
        area = t1.calcolaArea();
        System.out.println("L'area del trapezio è: " + area);
    }
}
