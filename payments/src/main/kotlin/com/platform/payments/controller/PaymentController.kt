package com.platform.payments.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("payments")
class PaymentController() {
    @GetMapping
    fun listar(): ResponseEntity<String> = ResponseEntity.ok("Sucesso")
}