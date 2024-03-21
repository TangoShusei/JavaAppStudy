package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.MinisterService;

@Controller
public class MinisterController {
	
    @Autowired
    MinisterService service;
	
    @GetMapping("/search")
    public String MinisterList(@RequestParam("userId") @Nullable Integer userId, Model model) {
		
        // serviceを使って、一覧をDBから取得する
        Optional<String> MinisterName = service.findMinisterNameById(userId);
        // modelに一覧を設定して、画面に渡す
        model.addAttribute("ministerName", MinisterName);
        // ministerData.htmlの表示
        return "minister";
    }
}