public class Triangulo {
    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Método para calcular el área usando la fórmula de Herón
    public double calcularArea() {
        double s = calcularPerimetro() / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Triangulo t = new Triangulo(3, 4, 5);
        System.out.println("Perímetro: " + t.calcularPerimetro());
        System.out.println("Área: " + t.calcularArea());
    }
}
