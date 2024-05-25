public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

            SmartTv.diminuirVolume();
            SmartTv.diminuirVolume();
            SmartTv.diminuirVolume();
            SmartTv.aumentarVolume();
            System.out.println("O volume da TV está no:" + SmartTv.volume);

            SmartTv.aumentarCanal();
            SmartTv.aumentarCanal();
            SmartTv.aumentarCanal();
            SmartTv.diminuirCanal();
            SmartTv.mudarCanal(15);
            System.out.println("O canal atual agora é o canal:" + SmartTv.canal);
  
            SmartTv.ligar();
                System.out.println("A TV está:" + SmartTv.ligada);

            SmartTv.desligar();
                System.out.println("A TV está:" + SmartTv.ligada);
    }
}
