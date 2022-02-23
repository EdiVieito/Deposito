package cuentas;
public class Main {
//Comentario
    public static void main(String[] args) {
        operativa_cuenta();
    }
 
	private static void operativa_cuenta() {
		CCuenta miCuenta;
        double saldoActual;
        float cantidad;
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
