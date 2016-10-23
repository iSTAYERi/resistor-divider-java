package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField txtFieldVref;
    public TextField txtFieldVout;
    public TextField txtFieldR1;
    public TextField txtFieldR2;
    private float vout, vref, r1, r2;

    public void pressButtonVout(ActionEvent event){
        System.out.println("1");
        getValues();
        vout = ((r1*vref)/r2)+vref;
        setValues();
    }
    public void pressButtonR1(ActionEvent event){
        System.out.println("2");
        getValues();
        r1 = ((vout-vref)*r2)/vref;
        setValues();
    }
    public void pressButtonR2(ActionEvent event){
        System.out.println("3");
        getValues();
        r2 = (r1*vref)/(vout-vref);
        setValues();
    }
    public void setValues() {
        txtFieldR1.setText(String.valueOf(r1));
        txtFieldR2.setText(String.valueOf(r2));
        txtFieldVout.setText(String.valueOf(vout));
        txtFieldVref.setText(String.valueOf(vref));
    }
    public void getValues(){
        r1 = Float.parseFloat(txtFieldR1.getText());
        r2 = Float.parseFloat(txtFieldR2.getText());
        vout = Float.parseFloat(txtFieldVout.getText());
        vref = Float.parseFloat(txtFieldVref.getText());
    }
}
