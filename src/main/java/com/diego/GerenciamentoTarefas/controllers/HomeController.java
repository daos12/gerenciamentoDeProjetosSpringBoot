package com.diego.GerenciamentoTarefas.controllers;

import com.diego.GerenciamentoTarefas.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.List;

@Controller
public class HomeController {


    private final TodoRepository todoRepository;

    public  HomeController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }


    @GetMapping("/")
    public ModelAndView home(){
        //Exemplo adicionando valores a nossa pagina web
        var ModelAndView = new ModelAndView("home");
        ModelAndView.addObject("nome","Diego Antonio");

        //Exemplo adicionando lista a nossa pagina web
        var alunos = List.of("Diego","Antonio","Marta","Pitucha");
        ModelAndView.addObject("alunos",alunos);

        //Exemplo adicionando checagem bollean a nossa pagina web (somente aparece quando true)
        ModelAndView.addObject("ehProgramador",false);

        var todos = todoRepository.findAll();
        System.out.println(todos);
        //JOptionPane.showMessageDialog(null,todos);



        return ModelAndView;
    }
}
