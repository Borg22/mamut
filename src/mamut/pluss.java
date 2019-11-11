package mamut;


	import javafx.scene.Group;
	import javafx.scene.control.Button;

	public class pluss extends Group{
	                    //skapar en knapp med texten +.
	                    public pluss() {
	                                       Button knapp = new Button();
	                                       knapp.setMinWidth(50);
	                                       knapp.setMinHeight(50);
	                                       knapp.setText("+");
	                                       this.getChildren().add(knapp);
	                                       //när knappen klickas på så kallas metoden add i mainmetoden
	                                       knapp.setOnAction(e -> calc.add());
	                    }
	                    
	                    
	                    
	}



