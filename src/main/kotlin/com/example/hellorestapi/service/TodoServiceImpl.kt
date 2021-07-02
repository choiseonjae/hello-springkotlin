package com.example.hellorestapi.service

import com.example.hellorestapi.dto.Todo
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl: TodoService {
    override fun getTodos(): Todo {
        return Todo("장보기", "야채 사기")
    }
}