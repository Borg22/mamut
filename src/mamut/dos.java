package mamut;

import javafx.application.Application; // B�rjar med att importera alla olika funktioner av javafx som vi ska anv�nda oss av 
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class dos extends Application {  // H�r iporterar jag application 

public static class layout_test extends Application {

@Override
public void start(Stage primaryStage) throws Exception {

HBox bottom = new HBox();
Button exitButton = new Button("Exit"); // Skapar en exit knapp 
bottom.getChildren().add(exitButton);
exitButton.setOnAction(event -> {
primaryStage.close();  // S�tter funktion p� knappen

});

Button Borg = new Button("Hockey Shop"); // Skapar en ny knapp som �ppnar en ny sida 
bottom.getChildren().add(Borg);
Borg.setOnAction(event -> {
primaryStage.setScene(new Scene(new Group(),500 ,500 , Color.RED)); // F�rgl�gger den nya sidan

});

Circle circle = new Circle(); // Skapar cirkeln och v�ljer f�rg och storlek
circle.setFill(Color.BLUE);
circle.setRadius(100);
circle.setTranslateX(90);
circle.setTranslateY(180);


Button Hjelm = new Button(";)"); // Skapar en knapp som ska skapa en cirkel
bottom.getChildren().add(Hjelm);
Hjelm.setOnAction(event -> {
bottom.getChildren().add(circle);

});

Rectangle rectangle = new Rectangle(); // Skapar en rektangel
rectangle.setFill(Color.GREEN);
rectangle.setWidth(100);
rectangle.setHeight(90);
rectangle.setTranslateX(50);
rectangle.setTranslateY(25);


Button Nicke = new Button("Rektangel"); // Skapar en knapp som ska skapa en rektangel
bottom.getChildren().add(Nicke);
Nicke.setOnAction(event -> {
bottom.getChildren().add(rectangle); 
});

Scene scene = new Scene(bottom, 500, 500);

primaryStage.setScene(scene);
primaryStage.show(); 

}

public static void main(String[] args) { 
launch();    // M�ligheten att kunna k�ra main metoden

}
}


public void start(Stage primaryStage) throws Exception { // Denna metod g�r sj�lva utseendet 
	
	

}
}

