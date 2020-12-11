package com.xiaopy.springfx8.view.controller;

import com.xiaopy.springfx8.service.ConfigItemService;
import com.xiaopy.springfx8.view.FirstView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author xiaopeiyu
 * @since 2020/12/8
 */
@FXMLController
public class TestViewController implements Initializable {

    public TextField cmdText;

    public Button testButton;

    public Button testButton2;

    public TextArea textArea;

    public Button shellBtn;

    public Button firstBtn;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConfigItemService configItemService;

    @Autowired
    private FirstView firstView;


    public void onClick() {
        String object = restTemplate.getForObject("http://localhost:10086/test", String.class);
        textArea.setText("访问地址：http://localhost:10086/test");
       // textArea.setText(configItemService.listAll().toString());
//        ConfigItem item = new ConfigItem();
//        item.setName("test");
//        item.setValue("test");
//        configItemService.saveConfigItem(item);
    }

    public void clear() {
        textArea.clear();
    }

    public void openShell() throws IOException {
        String cmd = "cmd /c D:\\linux\\xshell\\Xshell.exe "+cmdText.getText();;
        Runtime.getRuntime().exec(cmd);
    }

    public void gotoFirstView(){
        Stage stage=new Stage();
        Scene scene = new Scene(firstView.getView());
        stage.setScene(scene);
        stage.show();
        Stage main = (Stage)cmdText.getScene().getWindow();
        main.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
