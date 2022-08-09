package com.callor.todo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

@RequestMapping(value = "/todolist")
@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public String view() {

		return "todolist/todoview";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String insert() {
		return "todolist/todoview";
	}

	@RequestMapping(value = "/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute("vo") TodoVO vo, Model model) {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat toDay = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat toTime = new SimpleDateFormat("HH:mm:SS");

		vo.setT_sdate(toDay.format(date));
		vo.setT_stime(toTime.format(date));
		todoService.insert(vo);
		model.addAttribute("TODO", vo);

		return "todolist/todoview";
	}

	@RequestMapping(value = "/{t_seq}/update", method = RequestMethod.GET)
	public String update(@RequestParam("t_seq") Long t_seq, Model model) {
		TodoVO vo = todoService.findById(Long.valueOf(t_seq));
		model.addAttribute("TODO", vo);

		return "todolist/todoview";
	}

	@RequestMapping(value = "/{t_seq}/update", method = RequestMethod.POST)
	public String update(@RequestParam("t_seq") Long t_seq, @ModelAttribute("vo") TodoVO vo) {
		t_seq = Long.valueOf(t_seq);
		vo.setT_seq(t_seq);
		todoService.update(vo);
		return "redirect:/";
	}

	@RequestMapping(value = "/{t_seq}/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("t_seq") Long t_seq) {
		todoService.delete(Long.valueOf(t_seq));
		return "redirect:/";
	}
	
	@RequestMapping
	public String comp() {
		
	}

}
