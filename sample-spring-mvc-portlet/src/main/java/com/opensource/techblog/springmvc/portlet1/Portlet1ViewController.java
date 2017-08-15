/*
Controller Class for Portlet 1
*/
package com.opensource.techblog.springmvc.portlet1;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller
@RequestMapping("VIEW")
public class Portlet1ViewController {

	@RenderMapping
	public String defaultPortlet1Render(RenderRequest renderRequest, RenderResponse renderResource , Model model) {
		
		renderRequest.setAttribute("name", "This is Portlet 1 JSP");		
		return "view";
	}

}