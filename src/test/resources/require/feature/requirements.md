# Requisiti

## Requisiti funzionali

### Requisiti utente

-   Utente finale:

    -   L'utente finale in possesso di un account può effettuare
        l'accesso utilizzando le proprie credenziali utente tramite una
        sezione di login.

    -   L'utente finale non ancora in possesso di un account può creare
        il proprio profilo utente tramite una sezione di registrazione.

    -   L'utente finale può visualizzare le informazioni relative al
        proprio account in una schermata profilo e modificare la propria
        password di accesso in un qualunque momento successivo al login.

    -   L'utente finale può effettuare la disconessione dal proprio
        account in un qualunque momento.

    -   L'utente finale può visualizzare la lista delle proprie auto
        registrate e consultare in tempo reale il loro stato
        (parcheggiata o non) ed il numero di abbonamenti attivi
        associati alle auto.

    -   L'utente può registrare una nuova auto nel sistema, specificando
        modello targa ed altri attributi.

    -   L'utente può rimuovere dal sistema una o più auto in precedenza
        registrate previa conferma di eliminazione.

    -   L'utente può visualizzare attraverso una mappa i parcheggi
        presenti in una determinata località ed i relativi abbonamenti
        messi a disposizione dai gestori. I parcheggi sono rappresentati
        da speciali marker posizionati sulla mappa stessa che permettono
        all'utente di conoscere in tempo reale l'occupazione corrente
        del parcheggio.

    -   L'utente può aggiornare la località mostrata dalla mappa
        interagendo con la mappa stessa ma anche attraverso l'uso di una
        barra di ricerca che permetta di inserire il nome di una nuova
        località da mostrare.

    -   L'utente può acquistare un abbonamento per un determinato
        parcheggio, qualora i posti disponibili siano superiori a zero,
        indicando la tipologia di abbonamento tra quelle messe a
        disposizione dal gestore del parcheggio e l'auto a cui associare
        l'abbonamento. Selezionati auto ed abbonamento, l'utente può
        completare l'acquisto inserendo i dati della propria carta.

    -   L'utente può visualizzare, per ciascuna delle proprie auto, lo
        storico degli abbonamenti posseduti e le relative informazioni,
        come date di inizio e di fine validità e stato dell'abbonamento
        (attivo o scaduto).

    -   L'utente può visualizzare, per ciascuna delle proprie auto, lo
        storico delle soste effettuate. Per ogni sosta, l'utente deve
        poter visualizzare la data e l'ora di inizio della sosta, nonché
        la durata effettiva della sosta.

-   Gestore di parcheggi

    -   Il gestore di parcheggi in possesso di un account può effettuare
        l'accesso utilizzando le proprie credenziali di gestore tramite
        una sezione di login.

    -   Il gestore di parcheggi può visualizzare le informazioni
        relative al proprio account in una schermata profilo e
        modificare la propria password di accesso in un qualunque
        momento successivo al login.

    -   Il gestore di parcheggi può effettuare la disconessione dal
        proprio account in un qualunque momento.

    -   Il gestore di parcheggi può visualizzare la lista dei propri
        parcheggi registrati, visualizzando per ciascuno di essi le
        relative informazioni, tra le quali il numero di posti occupati
        in tempo reale.

    -   Il gestore di parcheggi può modificare alcune informazioni
        relative ai propri parcheggi, come località e numero di posti
        auto disponibili

    -   Il gestore di parcheggi può registrare un nuovo parcheggio nel
        sistema, specificandone località e numero di posti.

    -   Il gestore di parcheggi può rimuovere dal sistema uno o più
        parcheggi in precedenza registrati previa conferma di
        eliminazione.

    -   Il gestore di parcheggi può visualizzare, per ciascun parcheggio
        in proprio possesso, la lista degli abbonamenti disponibili e
        modificarne le relative informazioni, come durata e costo.

    -   Il gestore di parcheggi può registrare un nuovo abbonamento nel
        sistema per un determinato parcheggio.

    -   Il gestore di parcheggi può rimuovere dal sistema uno o più
        abbonamenti in precedenza registrati previa conferma di
        eliminazione.

    -   Il gestore di parcheggi può visualizzare le statistiche di
        ciascun parcheggio in proprio possesso, come: numero di soste
        effettuate in un dato giorno, numero di abbonamenti venduti per
        ciascun tipo, numero di nuovi clienti nell'ultimo periodo di
        tempo

    -   Il gestore di parcheggi può visualizzare in tempo reale lo stato
        di occupazione di ciascun parcheggio in proprio possesso

### Requisiti di sistema

-   Si rende necessaria la distinzione tra le due diverse categorie di
    profili (utente finale e gestore di parcheggi).

-   In seguito all'eliminazione di un parcheggio da parte di un gestore
    di parcheggi, gli utenti finali non devono essere più in grado di
    visualizzare il parcheggio sulla mappa interattiva ma ciò non deve
    affliggere la visualizzazione dello storico delle soste. Il
    parcheggio dovrà infatti continuare ad essere visibile anche se
    eliminato nella sezione dello storico.

-   Lo stesso si applica per la gestione degli abbonamenti: un
    abbonamento eliminato non deve essere più acquistabile dagli utenti
    finali ma deve continuare ad essere visibile nella sezione
    abbonamenti acquistati qualora l'utente finale abbia acquistato un
    abbonamento di tale tipologia.

-   Le password di utenti finali e gestori di parcheggi non devono
    essere salvate in chiaro all'interno della base di dati.

## Requisiti non funzionali

-   Rapida elaborazione delle richieste di gestori e utenti senza
    situazioni di blocco dovute a lunghi caricamenti.

-   L'interfaccia utente deve essere intuitiva e facile da navigare, sia
    per i gestori di parcheggi che per gli utenti finali.

-   Il sistema deve essere in grado di gestire un numero crescente di
    parcheggi, gestori e utenti senza che ciò comprometta in alcun modo
    le prestazioni.

-   Il sistema dovrà risultare facilmente estendibile in vista di
    aggiornamenti futuri
