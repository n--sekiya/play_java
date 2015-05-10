package controllers;

import play.mvc.Controller;

public class ControllerBase extends Controller {
	
	/** POST **/
	private static String POST = "POST";
	/** GET **/
	private static String GET = "GET";
	
	/** ERRER **/
	protected static String SUCCESS = "success";
	/** ERRER **/
	protected static String ERROR = "error";
	
	protected static boolean requestPostMethod() {
		return POST.equals(request().method());
	}
	
	protected static boolean requestGetMethod() {
		return GET.equals(request().method());
	}
	
}
