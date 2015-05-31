package controllers;

import models.entity.User;
import play.data.Form;
import play.mvc.Result;
import play.*;
import play.mvc.*;

import views.html.*;

/**
 * アカウント登録画面
 */
public class Signup extends ControllerBase {

	/**
	 * 初期表示
	 * @return signup.scala.html
	 */
	public static Result edit() {
		Logger.info("初期表示");
		Form<User> user = new Form(User.class);
		return ok(signup.render(user));
	}

	/**
	 * 確認画面
	 * @return
	 */
	public static Result confirm() {
		if (requestGetMethod()) {
			Form<User> user = new Form(User.class);
			return ok(signup.render(user));
		} else {
			Form<User> user = new Form(User.class).bindFromRequest();
			if (user.hasErrors()) {
				flash(ERROR, "エラーがあります。");
				return badRequest(signup.render(user));
			} else {
				user.get().save();
				return redirect("/");
			}
		}
	}

}
