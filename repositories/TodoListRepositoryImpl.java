package repositories;

import entities.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository{
    public static TodoList[] todos=new TodoList[10];


    @Override
    public TodoList[] getAll() {
        return new TodoList[0];
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public Boolean remove(Integer id) {
        return null;
    }

    @Override
    public Boolean edit(TodoList todoList) {
        return null;
    }
}
