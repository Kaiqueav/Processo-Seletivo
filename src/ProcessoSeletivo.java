public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       analisarCanditado(1900.0);
       analisarCanditado(2200.0);
       analisarCanditado(2000.0);


    }

    static void analisarCanditado( double salarioEstimado){
        double salarioBase = 2000.0;
        if (salarioBase > salarioEstimado) { 
            System.out.println("Ligar para candidato");
        }else if (salarioBase == salarioEstimado){
            System.out.println("aguardando");
        } else { 
            System.out.println("aguardando demais");
        }
        
       

    }
}
