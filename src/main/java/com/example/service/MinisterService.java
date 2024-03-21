package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.repository.MinisterRepository;

@Service
@Transactional
public class MinisterService {
	
    @Autowired
    MinisterRepository repository;
	
    /**
     * データベースから一覧を取得する
     * @return
     */
    public Optional<String> findMinisterNameById(Integer id) {
      return repository.findNameById(id);
    }
}