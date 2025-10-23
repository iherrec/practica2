// Archivo: TrianguloEquilatero.java
public class TrianguloEquilatero {

    // Atributo: longitud del lado
    private double lado;

    // Constructor
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 3 * lado;
    }

    // Método para calcular el área
    public double calcularArea() {
        // Fórmula del área de un triángulo equilátero: (√3 / 4) * lado^2
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    // Método principal (main) para probar la clase
    public static void main(String[] args) {
        TrianguloEquilatero t = new TrianguloEquilatero(6);

        System.out.println("Lado: " + t.lado);
        System.out.println("Perímetro: " + t.calcularPerimetro());
        System.out.println("Área: " + t.calcularArea());
    }
}
