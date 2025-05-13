package io.github.Guimaraes131.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final TodoValidator validator;
    private final MailSender mailSender;

    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public TodoEntity atualizarStatus(TodoEntity todo) {

        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";

        mailSender.enviar("Todo " + todo.getDescricao() + " foi atualizado para " + status);
        return repository.save(todo);
    }

    public TodoEntity buscar(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
