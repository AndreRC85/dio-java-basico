public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Status TV: " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal (22);

        smartTv.ligar();
        System.out.println("Status TV: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status TV: " + smartTv.ligada);
    }
}
