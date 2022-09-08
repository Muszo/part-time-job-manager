package Application.src;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class App extends Application {
    public static void main(String[] args) {


        try (XSSFWorkbook workbook = new XSSFWorkbook("Application/data/test.xlsx")) {

            ExcelHandler excelHandler = new ExcelHandler(workbook.getSheetAt(0));
            excelHandler.createColumn();
            workbook.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setHeight(500);
        stage.setWidth(700);
        stage.show();
    }
}
