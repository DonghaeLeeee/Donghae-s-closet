package main;

import java.util.HashMap;
import java.util.Map;

import controller.Controller;
import controller.ListController;
import controller.RegActionController;
import controller.RegController;

public class RequestControllerMapping {

	public static final Map<RequestKeyValue, Controller> mapping = new HashMap<>();

	public static void init() {
		mapping.put(new RequestKeyValue("/reg.hrd", "GET"), new RegController());
		mapping.put(new RequestKeyValue("/reg.hrd", "POST"), new RegActionController());
		mapping.put(new RequestKeyValue("/list.hrd", "GET"), new ListController());
	}

	public static Controller getController(RequestKeyValue key) {
		return mapping.get(key);
	}
}
