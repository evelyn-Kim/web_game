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

		String msg = "";//��� ���� ���ڿ�(���� ��, ��)

		if(num == com_num) {
			msg = num+" : �����Դϴ�. "+count+"�� ���� ������ϴ�. ���ο� ���ڷ� �����߽��ϴ�.";
			count = 0;
			com_num = (int)(Math.random()*100+1);
		}else if(num < com_num) {
			count++;
			msg = num+"���� �����ּ���";
		}else {
			count++;
			msg = num+"���� �����ּ���";
		}

		if (count > 10) {
			msg = "����� ���� ��û�ϱ���! ������"+com_num+" ���ο� ���ڷ� �����߽��ϴ�.";
			com_num = (int)(Math.random()*100+1);
			count = 0;
		}else {
			msg = msg;
		}
		
		//msg = num+":"+msg; //�̷��� �ص� 
		model.addAttribute("msg", msg);
		
		return "findNumber";
	}
}
