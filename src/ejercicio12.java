public class ejercicio12 {
    public static void main(String[] args) {
        double tarifa_hora = 5000.0;
        double porcentaje_de_retencion = 12.5;
        int horasTrabajadas = 48;
        double salarioBruto = horasTrabajadas * tarifa_hora;
        double retencionFuente = (porcentaje_de_retencion / 100) * salarioBruto;

        double salarioNeto = salarioBruto - retencionFuente;
        
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención en la fuente: $" + retencionFuente);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
