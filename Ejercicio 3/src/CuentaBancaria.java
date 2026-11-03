public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;

        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        }else{
            this.saldo = 0; 
        }
    }

    // Metodos
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        if(titular != null && !titular.isEmpty()){ // Verificamos que el nuevo titular no sea nulo ni vacio
            this.titular = titular; // Si es valiudo, actualizamos el nombre del titular

        }else{
            System.out.println("Error: el titular no puede estar vacio:"); // Mostrarmos un mensjae de error
        }
    }

    // Metod p  depositar dinero en la cuenta
    public void depositar(double monto){
        if(monto > 0){
            saldo = saldo + monto;

            System.out.println("Deposito realizado correctamente");
        }else{
            System.out.println("Error: el monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double monto){
        if(monto > 0 && monto <= saldo){
            saldo = saldo - monto;
            System.out.println("Retiro realizo correctamente");
        }else{
            System.out.println("Error: no se puede retirar ese monto.");
        }
    }
}