package com.xiaopy.springfx8;

import com.xiaopy.springfx8.config.CustomLoadingConfig;
import com.xiaopy.springfx8.view.TestView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport {


    public static void main(String[] args) {
        launch(App.class, TestView.class, new CustomLoadingConfig(),args);
    }

}
