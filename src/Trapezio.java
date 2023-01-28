
/**
 * Classe per il calcolo dell'area del trapezio.
 * 
 * <b>@author Dhaskallo</b>
 * @versione 0
 */
public class Trapezio {
    private float baseMaggiore;
    /** Base maggiore del trapezio */
    private float baseMinore;
    /** Base minore del trapezio */
    private float altezza;
    /** Altezza del trapezio */

    public Trapezio(float baseMaggiore, float baseMinore, float altezza) {
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

    public float calcolaArea() {
        return (baseMaggiore + baseMinore) * altezza / 2;
    }
    /**
     * <u>Calcola l'area del trapezio.</u>
     * @return area del trapezio
     */

    public static void main(String[] args) {
        Trapezio t1 = new Trapezio(3,2,1);
       
        float area = t1.calcolaArea();
        System.out.println("L'area del trapezio è: " + area);
        t1 = new Trapezio(6,5,5);
        area = t1.calcolaArea();
        System.out.println("L'area del trapezio è: " + area);
    }
}
