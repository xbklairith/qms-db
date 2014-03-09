package com.tggs.qms;

import junit.framework.TestCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeControllerTest extends TestCase {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeControllerTest.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	public void testHandleRequestView() throws Exception {
		HomeController controller = new HomeController ();
//		ModelAndView modelAndView = controller.(null, null);
//		assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
//		assertNotNull(modelAndView.getModel());
//		String nowValue = (String) modelAndView.getModel().get("now");
//		assertNotNull(nowValue);
	}

}
