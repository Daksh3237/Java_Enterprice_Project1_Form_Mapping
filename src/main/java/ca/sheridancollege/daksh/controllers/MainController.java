
package ca.sheridancollege.daksh.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MainController {
	@GetMapping("/")
	public String indexPage() {
		return "index.html";
	}
	
	@GetMapping("/formPage")
	public String formPage() {
		return "javaFun.html";
	}
	
	
	@PostMapping("/formPost")
	public void formPage(HttpServletResponse response,
			@RequestParam String radio,
			@RequestParam (required = false) boolean checkbox,
			@RequestParam String name,
			@RequestParam String email) {
		
		try {
			PrintWriter out = response.getWriter();
			
			String o1 = String.format("<h1>Thanks for filling out the form,"+ name +"</h1>" );
			String o2=null, o3=null;
			
			if("Yes".equals(radio))
			{
				o2 = String.format("<h1>Glad you are having fun!</h1>");
			}
			else
			{
				o2 = String.format("<h1>Hope it gets better!</h1>");
			}
			
			if(checkbox) {
				o3 = String.format("<p><b>we'll add your email: </b></p>" + email);
			}
			else {
				o3 =  String.format("<p><b>We won't add your email to our list</b></p>");
			}
			String result = String.format(o1 + "<br>" + o2 + "<br>" + o3);
			out.print(result);
			out.close();
			
		}
		catch(IOException e) {
			System.out.println("error" + e.getMessage());
			e.printStackTrace();
		}
	}
	
}
