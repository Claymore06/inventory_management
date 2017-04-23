package controllers;

import com.google.inject.Inject;

import play.mvc.Controller;
import play.mvc.Result;
import services.TestService;

public class TestController extends Controller {

	@Inject
	private TestService testService;

	public Result index() {
		return ok(views.html.test.index.render(this.testService.findAllTestEntity()));
	}
}
