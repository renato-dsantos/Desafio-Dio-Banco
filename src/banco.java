public class Banco{

    public String nome;


    public String getNome(){
        return nome;

    }

     public void setNome(String nome){
        this.nome = nome;
        
    }
   

   public static void main(String[] args){
        conta cc = new ContaCorrente();
        conta poupanca = new ContaCorrente();

        cc.depositar(100);
        cc.transferir(100, poupanca)

        cc.impimirExtrato();
        poupanca.impimirExtrato();

   } 

    
}