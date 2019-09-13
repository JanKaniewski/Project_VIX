package sample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;



public class Obliczenia {


    ArrayList<Notowanie> listaFut1 = new ArrayList<Notowanie>();
    ArrayList<Notowanie> listaFut2 = new ArrayList<Notowanie>();
    ArrayList<Notowanie> Zbiorcza = new ArrayList<Notowanie>();



    public Obliczenia(String t1, String t2) {
        try {
            this.pierwszyFutures(String.valueOf(Enum.valueOf(t1)));
            this.drugiFutures(String.valueOf(Enum.valueOf(t2)));
            this.obliczeniaFinalne();
           } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }



    void pierwszyFutures(String address) throws MalformedURLException {
        pobierzNotowania(address, listaFut1);
    }

    void drugiFutures(String address) throws MalformedURLException {
        pobierzNotowania(address, listaFut2);
    }



    void obliczeniaFinalne() {
        //wyznaczenie pozycji początkowych Tabela1 i końcowych Tabela2 do obliczeń
        String dataStartowa = listaFut2.get(1).data;
        int pozycjaKoncowa = listaFut1.size();
        String dataKoncowa = listaFut1.get(pozycjaKoncowa - 1).data;
        int pozycjaStartowa = 0;
        String value = "";
        for (int i = 0; i < listaFut1.size(); i++) {
            if (listaFut1.get(i).data.equals(dataStartowa)) {
                pozycjaStartowa = i;
            }
        }
        //obliczenie różnicy wartości OHLC i zapis wraz z datą do finalnej tabeli
        for (int i = 0; i < pozycjaKoncowa - pozycjaStartowa; i++) {
            String data = listaFut1.get(pozycjaStartowa + i).data;
            String ticker = listaFut1.get(1).ticker + " - " + listaFut2.get(1).ticker;
            value = String.valueOf(Float.parseFloat(listaFut2.get(1 + i).open) - Float.parseFloat(listaFut1.get(pozycjaStartowa + i).open));
            Notowanie finalLine = new Notowanie(data, ticker, value);
            Zbiorcza.add(finalLine);
        }

    }

    public void pobierzNotowania(String address, ArrayList<Notowanie> listaRobocza) throws MalformedURLException {
        URL page = new URL(address);
        String line;
        try {
            HttpURLConnection conn = (HttpURLConnection) page.openConnection();
            conn.connect();
            InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
            BufferedReader buff = new BufferedReader(in);
            while (buff != null) {
                line = buff.readLine();
                Notowanie not = wczytajNotowanie(line);
                listaRobocza.add(not);
            }
        } catch (Exception e) {

        }
    }

    Notowanie wczytajNotowanie(String liniaNotowan) {
        String[] elementNotowan = liniaNotowan.split(",");
        System.out.println(elementNotowan[0]);
        System.out.println(elementNotowan[1]);
        System.out.println(elementNotowan[2]);
        Notowanie kolejneNotowanie = new Notowanie(elementNotowan[0], elementNotowan[1], elementNotowan[2]);
        return kolejneNotowanie;
    }

        //metoda testowa dla pobieranych/przeliczanych danych
    void test() {

        System.out.println(listaFut1.get(21).data + " " + listaFut1.get(21).open + " " + listaFut1.get(21).ticker);
        System.out.println(listaFut2.get(1).data + " " + listaFut2.get(1).open + " " + listaFut2.get(1).ticker);
        System.out.println(Zbiorcza.get(1).data);
    }
}
