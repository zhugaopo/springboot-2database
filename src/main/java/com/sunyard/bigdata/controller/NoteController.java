package com.sunyard.bigdata.controller;

import com.sunyard.bigdata.dao.NoteMapper;
import com.sunyard.bigdata.pojo.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    NoteMapper noteMapper;

    @RequestMapping("/queryall")
    @ResponseBody
    List<Note> queryAll() {
        return noteMapper.queryAll();
    }
}
