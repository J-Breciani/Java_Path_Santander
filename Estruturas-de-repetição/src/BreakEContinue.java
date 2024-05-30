public class BreakEContinue {
    public static void main(String[] args) {
        
        for (int numero = 1; numero <=5; numero ++){
            if (numero == 3){
                continue; // faz somente pular a impressão do número 3. No break, pararia depois da impressão do 2.
            }
            System.out.println(numero);
        }
    }
}
