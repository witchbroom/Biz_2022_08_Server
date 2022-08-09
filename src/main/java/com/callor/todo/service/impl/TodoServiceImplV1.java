package com.callor.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.callor.todo.model.TodoVO;
import com.callor.todo.persistance.TodoDao;
import com.callor.todo.service.TodoService;

@Service
public class TodoServiceImplV1 implements TodoService{
	
	@Autowired
	private TodoDao todoDao;

	@Override
	public void create_todo_table() {
		todoDao.create_todo_table();
	}

	@Override
	public List<TodoVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TodoVO vo) {
		
		List<TodoVO> todo = todoDao.selectAll();		
		return todoDao.insert(vo);
	}

	@Override
	public int update(TodoVO vo) {
		long t_seq = vo.getT_seq();
		todoDao.findById(t_seq);
		
		return todoDao.update(vo);
	}

	@Override
	public TodoVO findById(Long t_seq) {
		
		return todoDao.findById(t_seq);
	}

	@Override
	public int delete(Long t_seq) {
		
		TodoVO vo = todoDao.findById(t_seq);
		todoDao.delete(t_seq);
		return 0;
	}
	
	

}
