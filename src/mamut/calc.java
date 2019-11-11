package mamut;


	//Använd såhär:
	//klicka på knapparna för att skriva in första talet
	//klicka på + för att börja skriva in nästa tal
	//klicka på knapparna för att skriva in andra talet
	//klicka på lika med tecknet för att visa svaret
	//den nollställer sig automatiskt efter varje uträkning annars kan man bara klicka på + tecknet några gånger

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

	                                       // sätter storlek på textrutan
	                                       screen.setMinWidth(200);
	                                       screen.setMaxWidth(200);
	                                       screen.setMinHeight(50);
	                                       screen.setMaxHeight(50);
	                                       // stänger av så man inte kan skriva i textrutan
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

	                    // skapar variabel för det man skriver in
	                    static String a = "";

	                    // när man klickar på en knapp så läggs den knappens siffra till i strängen och
	                    // vi uppaterar textefälltet
	                    public static void write(String number) {
	                                       a = a + number;
	                                       screen.setText(a);
	                    }

	                    // när du klickar på + knappen så lagras det du skrivit in i variabeln b och
	                    // textfältet tömms så du kan skriva in på nytt
	                    static String b = "";

	                    public static void add() {
	                                       b = a;
	                                       a = "";
	                    }

	                    // vi kollar så båda variablerna har text sen gör vi om texten till heltal och
	                    // plussar ihop dem uppdaterar textfälltet med svaret samt nollställer våra
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



