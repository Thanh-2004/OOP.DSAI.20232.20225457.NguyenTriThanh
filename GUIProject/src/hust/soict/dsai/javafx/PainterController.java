package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.RadioButton;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class PainterController {
	
	private String tool;


	
    @FXML
    private Pane drawingAreaPane;
    
	@FXML
	void chooseTools(ActionEvent event) {
		String button = ((RadioButton)event.getSource()).getText();
		if (button.equals("Pen")) {
			tool = "Pen";
		}else {
			tool = "Eraser";
		}
	}
	

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	if (tool == "Pen" && event.getX()>=0) {
    		Circle newCircle = new Circle(event.getX(), event.getY(), 4.0, Color.BLACK);
    		drawingAreaPane.getChildren().add(newCircle);
    	}else if(tool == "Eraser" && event.getX()>=0){
    		Circle newCircle = new Circle(event.getX(), event.getY(), 4.0, Color.WHITE);
    		drawingAreaPane.getChildren().add(newCircle);
    	}
    }

}