package Lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LatinToEnglishController {
    @FXML
    private Button btnTranslate;

    @FXML
    private Label lblTranslation;

    @FXML
    private TextField txtLatin;


    @FXML
    void initialize() {

    }
    
    public void translate(){
    	
    	String latinWord = txtLatin.getText().toLowerCase(),
    			englishTranslation;
    	//comparing strings
    	//using if and else
    	if(latinWord.equals("sinister"))
    		englishTranslation = "left";
    	else if(latinWord.equals("dexter"))
    		englishTranslation = "right";
    	else if(latinWord.equals("medium"))
    		englishTranslation = "center";
    	else{
    		englishTranslation = "This entry can't be translated!";
    	}
    	
    	lblTranslation.setText(englishTranslation);
    }

}
