package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//estanciou um novo objeto do tipo FMLloader estanciou 
			Parent parent = loader.load();//chama o loader que carrega a view
			Scene mainScene = new Scene(parent);//cria um objeto do tipo scine que sera  a cena principal estancia a cena passando como argumento o objeto principal da view que é o anchorpane vazio
			primaryStage.setScene(mainScene);//pauco da cena//seta ele com a cena principal
			primaryStage.setTitle("Application JavaFX de Modelo");//definir um titulo para o pauco
			primaryStage.show();//mostra o pauco
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
