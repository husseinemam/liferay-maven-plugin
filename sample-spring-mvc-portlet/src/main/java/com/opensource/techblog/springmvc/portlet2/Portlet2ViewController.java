package com.opensource.techblog.springmvc.portlet2;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller
@RequestMapping("VIEW")
public class Portlet2ViewController {


	@RenderMapping
	public String defaultPortlet1Render(RenderRequest renderRequest, RenderResponse renderResource , Model model) {
		
		renderRequest.setAttribute("name", "This is Portlet 2 JSP");		
		return "view";
	}

}