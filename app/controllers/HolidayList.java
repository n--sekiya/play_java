package controllers;

import java.util.List;

import models.entity.Holiday;
import models.entity.Stamp;
import models.entity.User;
import play.data.Form;
import play.mvc.Result;
import play.i18n.Messages;
import play.*;
import play.mvc.*;
import views.html.*;

/**
 * 祝日一覧画面
 */
public class HolidayList extends ControllerBase {

	/**
	 * 初期表示
	 * @return signup.scala.html
	 */
	public static Result index() {
//		Logger.info("初期表示");
//		Form<Holiday> stamp = new Form(Holiday.class);
		List<Holiday> list = Holiday.find.all();
		return ok(stampList.render(list));
	}


}
