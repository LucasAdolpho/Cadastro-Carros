package com.CadastroCarros.controller.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
 @GetMapping("/") public String home(){ return "dominio/home"; }
 @GetMapping("/login") public String login(){ return "login"; }
}