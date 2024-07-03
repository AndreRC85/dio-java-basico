public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status 1 - TV LIGADA? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status 2 -  TV LIGADA? " +smartTv.ligada);
    }
}
