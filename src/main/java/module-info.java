module me.mdzs.ais3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires annotations;

    opens me.mdzs.ais3 to javafx.fxml;
    exports me.mdzs.ais3;
    exports me.mdzs.ais3.controllers;
    opens me.mdzs.ais3.controllers to javafx.fxml;
    exports me.mdzs.ais3.domain;
    opens me.mdzs.ais3.domain to javafx.fxml;
}