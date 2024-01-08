public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Processso seletivo");


    }

    static void analisarCanaditado( double salarioEstimado){
        double salarioBase = 2000.0;
        if (salarioBase > salarioEstimado) { 
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioEstimado){
            System.out.println("aguardando");
        }
        
       

    }
}
