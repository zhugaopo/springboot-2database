package com.sunyard.bigdata.dao;

import com.sunyard.bigdata.pojo.Note;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NoteMapper {

    List<Note> queryAll();
}
