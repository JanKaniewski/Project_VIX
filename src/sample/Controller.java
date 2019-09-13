package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    @FXML LineChart <String, Number> lineChart;
    @FXML Button button1;
    @FXML TextField ticker1;
    @FXML TextField ticker2;

    public String t1;
    public String t2;


    Stage stage = new Stage();


    public void setStage(Stage primaryStage){
        this.stage=stage;
    }


    public void btn(ActionEvent event){
        this.t1 = ticker1.getText();
        this.t2 = ticker2.getText();

        Obliczenia obl = new Obliczenia(t1,t2);
        lineChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series();
        for (int i = 20; i < obl.Zbiorcza.size(); i++) {                     //przesunięcie od "i" dni od początku - zalecane minimum 20, dopuszczalne 0 dni.
            series.getData().add(new XYChart.Data<String, Number>(obl.Zbiorcza.get(i).data, Float.parseFloat(obl.Zbiorcza.get(i).open)));
        }
        series.setName("Różnica kursów kontraktów w okresie wpólnych notowań");
        lineChart.setAnimated(false);
        lineChart.getData().add(series);

    }
}
