import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
    }

    // metodo para imprimir uma lista 
    static void imprimirCandidato(){
        String [] candidatos = {"Kaique", "Solange","Paulo", "Katiane"};
        System.out.println("lista de candidatos aprovados");

        for (String candidato: candidatos){
            System.out.println("o candidato selecionado foi:"  + candidato);
        }
    }

    // metodo de selecionar candidatos
    static void selecionarCandidato(){
        String [] candidatos = {"Kaique", "Solange","Paulo", "Katiane","Lorena","Damiana"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
            while (candidatoSelecionado < 5  && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioEstimado =  valorPrentendido();
                System.out.println("O candidado " + candidato + "solicitou este valor de salario" + salarioEstimado);
                if (salarioBase >= valorPrentendido()) {
                    System.out.println("O candidado " + candidato + "foi solicitado para a vaga");
                    candidatoSelecionado++;
                }
                candidatoAtual++;
            }
    }
    
    static double valorPrentendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);                                                  
    }
    // metodo analisar candidato
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
