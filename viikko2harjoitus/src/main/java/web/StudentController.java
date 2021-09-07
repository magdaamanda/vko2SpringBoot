package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

		@RequestMapping(value = "/hello2", method = RequestMethod.GET)
		public String greetings(Model model) {
			Object studentRepository;
			model.addAttribute("students", studentRepository.findAll());
			return "greetings";
		}
}