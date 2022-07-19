package com.platform.salesorder.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("order")
class OrderController() {
    @GetMapping("/porta")
    fun listar(@Value("\${local.server.port}") porta: String): ResponseEntity<String> {
        val msg = String.format("Requisição respondida pela instância executando na porta %s", porta)
        return ResponseEntity.ok(msg)
    }
}

