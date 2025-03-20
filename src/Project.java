import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class EmailScannerUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Email Scanner");

        Label emailLabel = new Label("Enter Email Content:");
        TextArea emailInput = new TextArea();
        emailInput.setPromptText("Paste email content here...");

        Button scanButton = new Button("Scan Email");
        Label resultLabel = new Label();

        scanButton.setOnAction(event -> {
            String emailContent = emailInput.getText();
            if (emailContent.isEmpty()) {
                resultLabel.setText("Please enter an email to scan.");
            } else {
                // Placeholder for scanning logic
                resultLabel.setText("Scanning...");
            }
        });

        VBox vbox = new VBox(10, emailLabel, emailInput, scanButton, resultLabel);
        vbox.setPadding(new Insets(15));

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
