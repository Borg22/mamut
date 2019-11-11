package mamut;


	import javafx.scene.Group;
	import javafx.scene.control.Button;

	public class button extends Group{

	                    //skapar en knapp med texten av den siffran som skrevs in.
	                    public button(int num) {
	                                       Button knapp = new Button();
	                                       knapp.setMinWidth(50);
	                                       knapp.setMinHeight(50);
	                                       knapp.setText(Integer.toString(num));
	                                       this.getChildren().add(knapp);
	                                       
	                                       //när knappen klickas på så kallas metoden write i mainmetoden
	                                       knapp.setOnAction(e -> calc.write(Integer.toString(num)));
	                    }
	                    
	                    
	                    
	}


