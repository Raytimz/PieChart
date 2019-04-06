package application;
	
import javafx.application.Application;
import javafx.geometry.Side;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			PieChart a = new PieChart();
			
			PieChart.Data slice1 = new PieChart.Data("China", 1275);
			PieChart.Data slice2 = new PieChart.Data("Indida", 1017);
			PieChart.Data slice3 = new PieChart.Data("Brazil", 172);
			PieChart.Data slice4 = new PieChart.Data("UK", 59);
			PieChart.Data slice5 = new PieChart.Data("China", 285);
			
			a.getData().add(slice1);
			a.getData().add(slice2);
			a.getData().add(slice3);
			a.getData().add(slice4);
			a.getData().add(slice5);
			
			a.setLegendSide(Side.LEFT);
			
			StackPane root = new StackPane(a);
			
			Scene scene = new Scene(root,400,400);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
