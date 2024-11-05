package sevices;

import entities.TodoList;
import repositories.TodoListRepository;

public class TodoListServicesImpl implements TodoListServices{
    private final TodoListRepository todoListRepository;

    public TodoListServicesImpl(final TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }


    @Override
    public TodoList[] getTodoList() {
        return new TodoList[0];
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public Boolean removeTodoList(Integer number) {
        return null;
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        return null;
    }
}
