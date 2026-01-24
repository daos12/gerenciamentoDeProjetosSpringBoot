package com.diego.GerenciamentoTarefas.repositories;

import com.diego.GerenciamentoTarefas.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {


}
