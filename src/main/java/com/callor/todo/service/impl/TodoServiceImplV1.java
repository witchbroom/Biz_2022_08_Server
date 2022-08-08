package com.callor.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.callor.todo.model.TodoVO;
import com.callor.todo.persistance.TodoDao;
import com.callor.todo.service.TodoService;

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
	public TodoVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(TodoVO vo) {
		
		
		
		todoDao.insert(vo);
		return 0;
	}

	@Override
	public int update(TodoVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
