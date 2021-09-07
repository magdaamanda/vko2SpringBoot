package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FriendListController {

		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String FriendListForm(Model model) {
			model.addAttribute("friend", new Friend());
			return "hello";
		}
}