# Software per la Gestione dei Conti Bancari

## Descrizione del Progetto
Questo software consente a una banca di gestire in modo efficiente i conti bancari dei suoi clienti, le transazioni effettuate e i finanziamenti richiesti. L'obiettivo principale è di centralizzare le informazioni rilevanti e di supportare le operazioni bancarie quotidiane.

## Caratteristiche Principali

### Gestione Clienti
- **Informazioni richieste per ogni cliente:**
    - Nome
    - Cognome
    - Data di nascita
    - Indirizzo e comune di residenza
    - Codice fiscale
    - Email
    - Numero di telefono

### Gestione Conti Bancari
- Ogni cliente può possedere uno o più conti bancari.
- **Informazioni richieste per ogni conto:**
    - Identificatore univoco (ID)
    - Cliente o clienti proprietari (per conti co-intestati)
    - Costo annuale del conto
    - Quantitativo di denaro presente nel conto
    - Data di sottoscrizione

### Gestione Transazioni
- Le transazioni rappresentano movimenti di denaro tra conti bancari (anche dello stesso cliente).
- **Informazioni richieste per ogni transazione:**
    - Quantitativo di denaro trasferito
    - Esatto momento della transazione
    - Identificatore univoco (ID)

### Gestione Finanziamenti
- Ogni cliente può richiedere un finanziamento.
- **Informazioni richieste per ogni finanziamento:**
    - Ammontare totale del finanziamento
    - Tasso di interesse applicato
    - Durata del finanziamento (in mesi)
    - Cliente che ha sottoscritto il finanziamento

## Obiettivi del Software
- Registrazione accurata delle informazioni dei clienti e delle operazioni bancarie.
- Supporto per conti co-intestati.
- Tracciamento di tutte le transazioni effettuate.
- Gestione efficiente dei finanziamenti richiesti dai clienti.

## Requisiti Tecnici
- Un database relazionale per memorizzare i dati di clienti, conti, transazioni e finanziamenti.
- Un'interfaccia utente intuitiva per l'inserimento e la consultazione dei dati.
- Sicurezza dei dati per garantire la protezione delle informazioni sensibili.

## Struttura del Database
1. **Tabella `Clienti`**:
    - `id_cliente` (PK)
    - `nome`
    - `cognome`
    - `data_nascita`
    - `indirizzo`
    - `comune_residenza`
    - `codice_fiscale`
    - `email`
    - `numero_telefono`

2. **Tabella `Conti`**:
    - `id_conto` (PK)
    - `id_cliente` (FK, può essere multiplo per conti co-intestati)
    - `costo_annuale`
    - `quantitativo_denaro`
    - `data_sottoscrizione`

3. **Tabella `Transazioni`**:
    - `id_transazione` (PK)
    - `id_conto_origine` (FK)
    - `id_conto_destinazione` (FK)
    - `quantitativo_denaro`
    - `momento_transazione`

4. **Tabella `Finanziamenti`**:
    - `id_finanziamento` (PK)
    - `id_cliente` (FK)
    - `ammontare_totale`
    - `tasso_interesse`
    - `durata_mesi`

## Note Finali
Questo progetto mira a garantire un'elevata affidabilità nella gestione delle operazioni bancarie, proteggendo i dati sensibili dei clienti e migliorando l'efficienza operativa della banca.
