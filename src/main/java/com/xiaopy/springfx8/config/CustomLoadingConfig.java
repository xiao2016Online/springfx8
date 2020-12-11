package com.xiaopy.springfx8.config;

import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * @author xiaopeiyu
 * @since 2020/12/8
 */

public class CustomLoadingConfig extends SplashScreen {
    @Override
    public String getImagePath() {
        return "/logo/timg.png";
    }


    @Override
    public Parent getParent() {
        ImageView imageView = new ImageView(getClass().getResource(getImagePath()).toExternalForm());
        imageView.setFitWidth(450);
        imageView.setFitHeight(300);
        final ProgressBar splashProgressBar = new ProgressBar();
        splashProgressBar.setPrefWidth(450);

        final VBox vbox = new VBox();
        vbox.getChildren().addAll(imageView, splashProgressBar);

        return vbox;
    }
}
