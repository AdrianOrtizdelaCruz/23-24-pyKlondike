import java.util.Random;

public class Baraja {

    private Carta[] cartas;
    private int ultima;

    public Baraja(){
        ultima = 0;
        cartas = new Carta[52];
        for(int palo=0;palo<4;palo++){
            for(int numero=0;numero<13;numero++){
                this.poner(new Carta(palo, numero));
            }
        }
        this.barajar();
    }

    private void barajar() {

        Random aleatorio = new Random();
        for(int i = 0; i<1000; i++){
            int origen = aleatorio.nextInt(52);
            int destino = aleatorio.nextInt(52);
            Carta carta = cartas[origen];
            cartas[origen] = cartas[destino];
            cartas[destino] = carta;
        }
    }

    private void poner(Carta carta) {
        cartas[ultima]=carta;
        ultima++;
    }

    public void mostrar() {
        System.out.println("BARAJA: ");
        
        Carta carta = this.cima();
        carta.mostrar();

    }

    private Carta cima() {
        return cartas[ultima-1];
    }

    public void moverA(Descarte descarte) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moverA'");
    }

}
