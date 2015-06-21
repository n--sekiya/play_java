package controllers;

import models.entity.Stamp;
import models.entity.User;
import play.data.Form;
import play.mvc.Result;
import play.i18n.Messages;
import play.*;
import play.mvc.*;
import views.html.*;

/**
 * ユーザ一覧画面
 */
public class StampList extends ControllerBase {

	/**
	 * 初期表示
	 * @return signup.scala.html
	 */
	public static Result index() {
		Logger.info("初期表示");
		Form<Stamp> stamp = new Form(Stamp.class);
		return ok(stampList.render());
	}


}
