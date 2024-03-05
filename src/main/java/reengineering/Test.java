package reengineering;

public class Test {

    /*
     * Scopo di questo esercizio è realizzare una GUI con l'aspetto mostrato nell'immagine fig1.png, 
     * e la cui logica permette di giocare una sorta di partita a scacchi con sole due torri, contro un computer
     * che se non può mangiare muove in modo random. Si ricordi che una torre si muovere in orizzontale o 
     * verticale (quindi nelle quattro direzioni), di quante caselle vuole (una o più).
     * 
     * L'applicazione si comporti complessivamente come segue:
     * 1) all'inizio si posizionano in modo random le due torri ("*" quella dell'umano, "o" quella del computer)
     * 2) l'utente sceglie una posizione di destinazione per la sua torre clickando sulla casella d'arrivo
     * -- se clicka su una cella non consentita il click viene ignorato
     * -- se muove mangiando l'altra torre, ossia ci si va sopra, allora si stampi su console "umano vince" e si resetti il gioco
     * 3) fatta una mossa valida, allora muove il computer come segue:
     * -- se può mangiare la torre dell'umano, la mangia, si stampi su console "computer vince" e si resetti il gioco
     * -- altrimenti si muove in modo random (per direzione e per numero di caselle)
     * 4) il turno ripassa all'umano, tornando al passo 1) qui sopra
     */

    public static void main(String[] args) throws java.io.IOException {
        new GUI(4); 
    }
}
