package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends ControllerBase {

    public static Result index() {
        return ok(index.render());
    }

}
