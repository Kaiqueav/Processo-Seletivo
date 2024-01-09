import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Kaique", "Solange","Paulo", "Katiane"};
        for (String candidato: candidatos){
             ligar(candidato);
        }
    }


// metodo paraa ligar os candidatos
    static void ligar(String candidado){
        int tentativasRealizadas = 1;
        boolean continuarTentando  = true;
        boolean atendeu = false;
        
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                
                if  (continuarTentando){
                    tentativasRealizadas++;
                } else {
                    System.out.println("contato realizado ");
                }


            } while(continuarTentando && tentativasRealizadas < 3);
                if (atendeu) {
                    System.out.println("conseguimos contato com" + candidado + "na"  + tentativasRealizadas + "tentativa");
                } else {
                    System.out.println("conseguimos contato com" + candidado + "numero maximo de tentativas "  + tentativasRealizadas + "realizadas");
                }
    }
    // metodo auxiliar
    static void atender(){
        return new Random().nextInt(3)==1;
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
