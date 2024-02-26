package exercises.bankaccount;

public class Bank {

    public void einzahlen(double betrag, Bankkonto konto) {
        double kontostand = konto.getKontostand();
        kontostand = kontostand + betrag;

        konto.setKontostand(kontostand);
    }

    public void abheben(double betrag, Bankkonto konto) {
        double kontostand = konto.getKontostand();

        if(kontostand >= betrag) {
            kontostand -= betrag;
            konto.setKontostand(kontostand);
        }
    }

    public void getKontostand(Bankkonto konto) {
        System.out.println(konto.getKontostand());
    }

    public void ueberweisen(double betrag, Bankkonto sender, Bankkonto empfaenger) {

        if(betrag > 0 && betrag <= sender.getKontostand()) {
            double kontostandSender = sender.getKontostand() - betrag;
            sender.setKontostand(kontostandSender);

            double kontostandEmpfaenger = empfaenger.getKontostand() + betrag;
            empfaenger.setKontostand(kontostandEmpfaenger);
        }
    }
}