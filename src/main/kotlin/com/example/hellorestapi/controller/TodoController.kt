package com.example.hellorestapi.controller

import com.example.hellorestapi.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(val todoService: TodoService) {

    @GetMapping("/health")
    fun health() = "health check"

    @GetMapping
    fun getTodos() = todoService.getTodos()

}