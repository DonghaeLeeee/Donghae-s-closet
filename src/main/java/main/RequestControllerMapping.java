package main;

import java.util.HashMap;
import java.util.Map;

import controller.Controller;
import controller.ListController;
import controller.LoginActionController;
import controller.LoginController;
import controller.LogoutController;
import controller.MyPageController;
import controller.RegActionController;
import controller.RegController;

public class RequestControllerMapping {

	public static final Map<RequestKeyValue, Controller> mapping = new HashMap<>();

	public static void init() {
		mapping.put(new RequestKeyValue("/reg.hrd", "GET"), new RegController());
		mapping.put(new RequestKeyValue("/reg.hrd", "POST"), new RegActionController());
		mapping.put(new RequestKeyValue("/list.hrd", "GET"), new ListController());
		mapping.put(new RequestKeyValue("/login.hrd", "GET"), new LoginController());
		mapping.put(new RequestKeyValue("/login.hrd", "POST"), new LoginActionController());
		mapping.put(new RequestKeyValue("/logout.hrd", "GET"), new LogoutController());
		mapping.put(new RequestKeyValue("/mypage.hrd", "GET"), new MyPageController());
	}

	public static Controller getController(RequestKeyValue key) {
		return mapping.get(key);
	}
}
