public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada == true){
            System.out.println("Canal: " + smartTv.canal);
            System.out.println("Volume: " + smartTv.volume);
        }

        smartTv.ligar();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        
        System.out.println("TV está ligada? " + smartTv.ligada);
        if(smartTv.ligada == true){
            System.out.println("Canal: " + smartTv.canal);
            System.out.println("Volume: " + smartTv.volume);
        }
    }
}
