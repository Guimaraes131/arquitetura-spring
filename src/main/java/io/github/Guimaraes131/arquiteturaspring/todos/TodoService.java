package io.github.Guimaraes131.arquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        return repository.save(novoTodo);
    }

    public TodoEntity atualizarStatus(TodoEntity todo) {
        return repository.save(todo);
    }

    public TodoEntity buscar(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
