package co.grandcircus.pizzawebsite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
 
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	
	@GetMapping("/specialty")
	public String specialty(String name, Double price, Model model ) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "specialty";
	}
	@GetMapping("/review")
	public String review() {
		return "review";
	}
	
	@PostMapping("/reviewconfirmation")
	public String reviewconfirmation(@RequestParam String name, @RequestParam(required=false) String review, @RequestParam String feedback, Model model) {
		model.addAttribute("Name", name);
		model.addAttribute("Review", review);
		model.addAttribute("feedback", feedback);
		return "reviewconfirmation";
	}
	
	@GetMapping("/custom")
	public String custom() {
		return "custom";
	}
	
	@PostMapping("/customconfirmation")
	public String customconfirmation(@RequestParam String size, @RequestParam Double toppings, @RequestParam(required=false) boolean glutenfree, @RequestParam String specialityPizza, Model model) {
		model.addAttribute("Size", size);
		model.addAttribute("Toppings", toppings);
		model.addAttribute("Gluten-Free", glutenfree);
		model.addAttribute("Special", specialityPizza);
		
		List<String> toppingChoices = new ArrayList<String>();
		toppingChoices.add("pepperoni");
		toppingChoices.add("sausage");
		toppingChoices.add("extra cheese");
		toppingChoices.add("vegan sausage");
		toppingChoices.add("green peppers");
		toppingChoices.add("tomatoes");
		toppingChoices.add("pineapple");
		toppingChoices.add("onions");
		toppingChoices.add("pickles");
		toppingChoices.add("garlic");

		
		double pizzaPrice = 0;
		double toppingsPrice = 0;
		double totalPrice = 0;
		
		if(size.equals("small")) {
			toppingsPrice = toppings * 0.5;
			pizzaPrice = 7.0;
			totalPrice = toppingsPrice + pizzaPrice;
		}
		else if (size.equals("medium")) {
			toppingsPrice = toppings * 1.0;
			pizzaPrice = 10.0;
			totalPrice = toppingsPrice + pizzaPrice;
		}
		else if(size.equals("large")) {
			toppingsPrice = toppings * 1.25;
			pizzaPrice = 12.0;
			totalPrice = toppingsPrice + pizzaPrice;
		}
		
		if (glutenfree) {
			totalPrice += 2.0;
		}
		
		model.addAttribute("Price", totalPrice);
		
		return "customconfirmation";
	}
	
	
	
}
