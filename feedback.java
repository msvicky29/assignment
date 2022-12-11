package feedback;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.scene.text.*;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
//import static javafx.application.Application.launch;
public class feedback extends Application
{
	@Override
	public void start(Stage p)
	{
		GridPane root = new GridPane();
		Text name = new Text();
		name.setText("Enter Your name:");
		name.setFont(Font.font("comic sans MS"));
		TextField tf1 = new TextField();
		Text reg = new Text();
		reg.setText("Enter Your Reg.No:");
		reg.setFont(Font.font("verdana"));
		TextField tf2 = new TextField();
		Text mail = new Text();
		mail.setText("Enter Your Mail-Id:");
		mail.setFont(Font.font("verdana"));
		TextField tf3 = new TextField();
		Text dept = new Text();
		dept.setText("Choose Department:");
		dept.setFont(Font.font("verdana"));
		ComboBox cb = new ComboBox();
		cb.getItems().addAll("CSE","IT","EEE","ECE","CIVIL","MECH");
		Text lang = new Text();
		lang.setText("Language Known:");
		lang.setFont(Font.font("verdana"));
		CheckBox lan1 = new CheckBox("Python");
		CheckBox lan2 = new CheckBox("Java");
		CheckBox lan3 = new CheckBox("C");
		CheckBox lan4 = new CheckBox("C++");
		CheckBox lan5 = new CheckBox("PHP");
		CheckBox lan6 = new CheckBox("None");
		Text infra = new Text();
		infra.setText("Infrastructure of the College:");
		infra.setFont(Font.font("verdana"));
		ComboBox cb1 = new ComboBox();
		cb1.getItems().addAll("Excellent","Good","Average","Not Bad","Need to Improve");
		Text water = new Text();
		water.setText("Water facility in the College:");
		water.setFont(Font.font("verdana"));
		ComboBox cb2 = new ComboBox();
		cb2.getItems().addAll("Excellent","Good","Average","Not Bad","Need to Improve");
		Text extra = new Text();
		extra.setText("Do you want any Extracurricular Activity?:");
		extra.setFont(Font.font("verdana"));
		RadioButton radio1 = new RadioButton("Yes!");
		RadioButton radio2 = new RadioButton("No :)");
		ToggleGroup tg = new ToggleGroup();
		radio1.setToggleGroup(tg);
		radio2.setToggleGroup(tg);
		Text room = new Text();
		room.setText("Comfort in Classroom:");
		room.setFont(Font.font("verdana"));
		ComboBox cb3 = new ComboBox();
		cb3.getItems().addAll("Excellent","Good","Average","Not Bad","Need to Improve");
		Text current = new Text();
		current.setText("Electricity connection:");
		current.setFont(Font.font("verdana"));
		ComboBox cb4 = new ComboBox();
		cb4.getItems().addAll("Excellent","Good","Average","Not Bad","Need to Improve");
		Text kind = new Text();
		kind.setText("Kindness of staff:");
		kind.setFont(Font.font("verdana"));
		ComboBox cb5 = new ComboBox();
		cb5.getItems().addAll("Excellent","Good","Average","Not Bad","Need to Improve");
		Text query = new Text();
		query.setText("Any Queries....:");
		query.setFont(Font.font("verdana"));
		TextArea area = new TextArea();
		Button btn1 = new Button("Submit");
		Button btn2 = new Button("Reset");
		//===================================Adding Element==========================
		root.addRow(0,name,tf1);
		root.addRow(1,reg,tf2);
		root.addRow(2,mail,tf3);
		root.addRow(3,dept,cb);
		root.addRow(4,lang);
		root.add(lan1, 0, 5);
		root.add(lan2, 1, 5);
		root.add(lan3, 2, 5);
		root.add(lan4, 0, 6);
		root.add(lan5, 1, 6);
		root.add(lan6, 2, 6);
		root.addRow(7,infra,cb1);
		root.addRow(8,water,cb2);
		root.add(extra, 0, 9);
		root.add(radio1, 1, 9);
		root.add(radio2, 2, 9);
		root.addRow(10,room,cb3);
		root.addRow(11,current,cb4);
		root.addRow(12,kind,cb5);
		root.addRow(13,query,area);
		root.addRow(14,btn1,btn2);
		//======================Action Listener==========================
		Alert a = new Alert(AlertType.NONE);
		EventHandler<ActionEvent>submit =  new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e)
			{
				a.setAlertType(AlertType.INFORMATION);
				a.setHeaderText("Thank You! for your feedback");
				a.setContentText("Your feedback was recorded.");
				a.show();
			}
		};
		EventHandler<ActionEvent>clear =  new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e2)
			{
				tf1.clear();
				tf2.clear();
				tf3.clear();
				area.clear();
				cb1.setValue(null);
				cb2.setValue(null);
				cb3.setValue(null);
				cb4.setValue(null);
				cb5.setValue(null);
				cb.setValue(null);
				radio1.setSelected(false);
				radio2.setSelected(false);
				lan1.setSelected(false);
				lan2.setSelected(false);
				lan3.setSelected(false);
				lan4.setSelected(false);
				lan5.setSelected(false);
				lan6.setSelected(false);
			}
		};
		btn1.setOnAction(submit);
		btn2.setOnAction(clear);
		root.setVgap(10);
		root.setHgap(3);
		Scene s = new Scene(root,1200,730);
		s.getStylesheets().add("style.css");
		p.setScene(s);
		p.setTitle("Feedback form");
		p.show();
		//======================CSS STYLE===========================
		
		root.setStyle("-fx-padding:30 30 30 30; -fx-background-color:#96fbc4;");
		name.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		reg.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		mail.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		lang.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		dept.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		infra.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		water.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		extra.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		room.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		kind.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		query.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		current.setStyle("-fx-font-weight:bold; -fx-font-size:20;");
		tf1.setStyle("-fx-font-size:17;");
		tf2.setStyle("-fx-font-size:17;");
		tf3.setStyle("-fx-font-size:17;");
		area.setStyle("-fx-font-size:17;");
		btn1.setStyle("-fx-padding:10; -fx-background-color:#000; -fx-text-fill:#fff; -fx-font-size:18;");
		btn2.setStyle("-fx-padding:11; -fx-background-color:#000; -fx-text-fill:#fff;  -fx-font-size:18;");
		}
public static void main(String[] args) {
	launch(args);

	}

}
