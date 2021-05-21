package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.Todo;

public interface TodoMapper {

    //全件取得
    @Select("select * from todo")
    List<Todo> selectAll();

    //idが一致した１件を取得
    @Select("select * from todo where id = #{id}")
    Todo selectOne(Long id);

    //登録
    @Options(useGeneratedKeys = true) //自動で連番のidを取得する
    @Insert("insert into todo (task) values (#{task})")
    void insert(Todo todo);

    //更新
    @Update("update todo set task = #{task} where id = #{id}")
    int update(Todo todo);

    //削除
    @Delete("delete from todo where id = #{id}")
    void delete(Long id);
}
