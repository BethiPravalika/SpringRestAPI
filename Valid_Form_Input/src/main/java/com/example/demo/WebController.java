package com.example.demo;

@Controller
public class WebController implements WebMvcConfigurer{
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/results").setViewName("results");
	}
	
	@GetMapping("/")
	public String showForm(PersonForm personform) {
		return "form";
	}
	
	@PostMapping("/")
	public String checkPersonInfo(@Valid PersonForm personform, BindingResult bindingresult) {
		 if (bindingresult.hasErrors()) {
			 return "form";
		 }
		  
		 return "redirect:/results";
	}
}


}
