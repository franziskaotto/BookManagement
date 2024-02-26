package exercises.bankaccount;

public class Main {

    public static void main(String[] args) {

        Bankkonto max = new Bankkonto();
        max.setInhaber("Max Mustermann");
        max.setIban("AT1234567890");
        max.setKontostand(100);

        Bank bank = new Bank();

        /**
         *
         * 2tes Bankkonto instanzieren - gehärt Maximillia Musterfrau.
         * Sie hat 100€ Konto
         * Sie überweist dem Max 27€.
         * Dazu muss die Bank nun Überweisungen beherrschen.
         */
        Bankkonto maximilliaKonto = new Bankkonto();
        maximilliaKonto.setKontostand(100);

        bank.ueberweisen(27, maximilliaKonto, max);


        bank.getKontostand(maximilliaKonto);
        bank.getKontostand(max);
    }
}