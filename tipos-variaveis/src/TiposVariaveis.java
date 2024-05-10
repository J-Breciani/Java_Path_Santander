public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;

        // Necessário se atentar aos tipos e seus limites.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        // Não pode ser mudada. 
        final double VALOR_PI = 3.14;

    }
}
