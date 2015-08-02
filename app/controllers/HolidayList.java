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
	 * 一覧表示
	 * @return signup.scala.html
	 */
	public static Result index() {
		List<Holiday> list = Holiday.find.all();
		return ok(holidayList.render(list));
	}

	/**
	 * 追加
	 * @return signup.scala.html
	 */
	public static Result add() {
		Form<Holiday> holiday = new Form(Holiday.class);
		return ok(holidayAdd.render(holiday));
	}

	/**
	 * 完了
	 * @return signup.scala.html
	 */
	public static Result completion() {
		Form<Holiday> holiday = new Form(Holiday.class).bindFromRequest();
		if (holiday.hasErrors()) {
			flash(ERROR, Messages.get("common.calendar.message.error"));
			return badRequest(holidayAdd.render(holiday));
		} else {
			holiday.get().save();
			flash(SUCCESS, Messages.get("common.calendar.message.success"));
			return redirect("/calendar/master/holiday");
		}
	}

	/**
	 * 削除
	 * @return signup.scala.html
	 */
	public static Result delete() {
//		List<Holiday> list = Holiday.find.all();
		return redirect("/calendar/master/holiday");
	}



}
