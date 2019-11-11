package mamut;


	//Anv�nd s�h�r:
	//klicka p� knapparna f�r att skriva in f�rsta talet
	//klicka p� + f�r att b�rja skriva in n�sta tal
	//klicka p� knapparna f�r att skriva in andra talet
	//klicka p� lika med tecknet f�r att visa svaret
	//den nollst�ller sig automatiskt efter varje utr�kning annars kan man bara klicka p� + tecknet n�gra g�nger

	import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class calc extends Application {

	                    // skapar en textruta
	                    static TextField screen = new TextField();

	                    public void start(Stage primaryStage) throws Exception {
	                                       Group root = new Group();
	                                       Scene scene = new Scene(root, 200, 200);
	                                       primaryStage.setScene(scene);
	                                       primaryStage.show();

	                                       // s�tter storlek p� textrutan
	                                       screen.setMinWidth(200);
	                                       screen.setMaxWidth(200);
	                                       screen.setMinHeight(50);
	                                       screen.setMaxHeight(50);
	                                       // st�nger av s� man inte kan skriva i textrutan
	                                       screen.setEditable(false);
	                                       root.getChildren().add(screen);

	                                       // skapar knappar 1-9 och positionerar ut dem
	                                       for (int i = 1; i <= 3; i++) {
	                                                           for (int j = 1; j <= 3; j++) {
	                                                                              button numbut = new button(i * j);
	                                                                              numbut.setTranslateX(i * 50 - 50);
	                                                                              numbut.setTranslateY(j * 50);
	                                                                              root.getChildren().add(numbut);
	                                                           }
	                                       }
	                                       // skapar 0 knappen
	                                       button numbut = new button(0);
	                                       numbut.setTranslateX(150);
	                                       numbut.setTranslateY(50);
	                                       root.getChildren().add(numbut);

	                                       // skapar + knappen
	                                       pluss plussbutton = new pluss();
	                                       plussbutton.setTranslateX(150);
	                                       plussbutton.setTranslateY(100);
	                                        root.getChildren().add(plussbutton);

	                                       // skapar = knappen
	                                       likamed lika = new likamed();
	                                       lika.setTranslateX(150);
	                                       lika.setTranslateY(150);
	                                       root.getChildren().add(lika);
	                    }

	                    // skapar variabel f�r det man skriver in
	                    static String a = "";

	                    // n�r man klickar p� en knapp s� l�ggs den knappens siffra till i str�ngen och
	                    // vi uppaterar textef�lltet
	                    public static void write(String number) {
	                                       a = a + number;
	                                       screen.setText(a);
	                    }

	                    // n�r du klickar p� + knappen s� lagras det du skrivit in i variabeln b och
	                    // textf�ltet t�mms s� du kan skriva in p� nytt
	                    static String b = "";

	                    public static void add() {
	                                       b = a;
	                                       a = "";
	                    }

	                    // vi kollar s� b�da variablerna har text sen g�r vi om texten till heltal och
	                    // plussar ihop dem uppdaterar textf�lltet med svaret samt nollst�ller v�ra
	                    // variabler
	                    public static void lika() {
	                                       if (!b.isEmpty() && !a.isEmpty()) {
	                                                           screen.setText(Integer.toString(Integer.parseInt(a) + Integer.parseInt(b)));
	                                                           a = "";
	                                                           b = "";
	                                       }

	                    }

	                    public static void main(String[] args) {
	                                       launch();
	                    }

	}



