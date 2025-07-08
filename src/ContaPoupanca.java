public class ContaPoupanca extends Conta{  
    

    @Override
     public void impimirExtrato(){
    System.out.println("Extrato Conta Poupança ****");
    super.imprimirInfosComuns();
    
   }
    
}