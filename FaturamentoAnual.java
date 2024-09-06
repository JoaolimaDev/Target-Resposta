import java.util.Arrays;

public class FaturamentoAnual {
    
    public static void main(String[] args) {
   
        double[] faturamentoDiario = {
            1200.50, 0, 850.75, 1300.00, 0, 0, 2000.50, 
        };
        
        // Chamar o método para processar o faturamento
        processarFaturamento(faturamentoDiario);
    }
    
    public static void processarFaturamento(double[] faturamentoDiario) {
       
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

    
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) { // Ignora dias sem faturamento
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

    
        double mediaAnual = somaFaturamento / diasComFaturamento;

     
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaAnual) {
                diasAcimaDaMedia++;
            }
        }

  
        System.out.println("Menor faturamento do ano: " + menorFaturamento);
        System.out.println("Maior faturamento do ano: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média anual: " + diasAcimaDaMedia);
    }
}
