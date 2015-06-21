package controllers;

import models.entity.User;
import play.data.Form;
import play.mvc.Result;
import play.*;
import play.mvc.*;

import views.html.*;

/**
 * ユーザ一覧画面
 */
public class UserList extends ControllerBase {

	/**
	 * 初期表示
	 * @return signup.scala.html
	 */
	public static Result index() {
		Logger.info("初期表示");
		Form<User> user = new Form(User.class);
		return ok(userList.render(user));
	}


}
