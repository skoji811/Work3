package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.mapper.TodoMapper;

@Service
public class TodoService {

    @Autowired
    private TodoMapper todoMapper;

    //全件取得
    @Transactional
    public List<Todo> selectAll() {
        return todoMapper.selectAll();
    }

    //一件取得
    @Transactional
    public Todo selectOne(Long id) {
        return todoMapper.selectOne(id);
    }

    //登録
    @Transactional
    public void insert(Todo todo) {
        todoMapper.insert(todo);
    }

    //更新
    @Transactional
    public int update(Todo todo) {
        return todoMapper.update(todo);
    }

    //削除
    @Transactional
    public void delete(Long id) {
        todoMapper.delete(id);
    }
}
