import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import sevices.TodoListServices;
import sevices.TodoListServicesImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListServices todoListServices= new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();
        }
    }

