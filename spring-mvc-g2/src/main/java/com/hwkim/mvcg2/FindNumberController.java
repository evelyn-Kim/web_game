package com.hwkim.mvcg2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindNumberController {

	private int com_num = (int)(Math.random()*100+1);
	private int count = 0;
	
	@RequestMapping("/findnumber")
	public String findNumber(
			Model model,
			@RequestParam(required=false, defaultValue = "-1") int num
			) {

		String msg = "";//결과 판정 문자열(정답 높, 낮)

		if(num == com_num) {
			msg = num+" : 정답입니다. "+count+"번 만에 맞췄습니다. 새로운 숫자로 변경했습니다.";
			count = 0;
			com_num = (int)(Math.random()*100+1);
		}else if(num < com_num) {
			count++;
			msg = num+"보다 높여주세요";
		}else {
			count++;
			msg = num+"보다 낮춰주세요";
		}

		if (count > 10) {
			msg = "당신은 정말 멍청하군요! 정답은"+com_num+" 새로운 숫자로 변경했습니다.";
			com_num = (int)(Math.random()*100+1);
			count = 0;
		}else {
			msg = msg;
		}
		
		//msg = num+":"+msg; //이렇게 해도 
		model.addAttribute("msg", msg);
		
		return "findNumber";
	}
}
