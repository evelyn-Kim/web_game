package com.hwkim.mvcg1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindGoldController {

	private int com_x = (int)(Math.random()*10+1);
	private int com_y = (int)(Math.random()*10+1);
	
	@RequestMapping("/findgold")
	public String findGold(
		Model model,
		@RequestParam(required=false, defaultValue = "-1") int x,
		@RequestParam(required=false, defaultValue = "-1") int y
			) {
		if( x > -1 && y > -1 ) {
			double xdiff = Math.pow((com_x-x),2);
			double ydiff = Math.pow((com_y-y),2);
			double zdiff = Math.sqrt(xdiff+ydiff);
			
			int z = (int)zdiff;
			String msg = "x="+x+", y="+y+" ";
			
			if(z == 0) {
				msg += "정답입니다. 금을 찾았습니다.";	
				com_x = (int)(Math.random()*10+1);
				com_y = (int)(Math.random()*10+1);
			}else {
				msg += "금과의 거리는 "+z;
			}
			model.addAttribute("msg", msg);
		}
		
		return "findGold";
	}
}
