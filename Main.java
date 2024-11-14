import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDbImpl;
import sevices.TodoListServices;
import sevices.TodoListServicesImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        Database database = new Database("database", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDbImpl(database);
        TodoListServices todoListServices = new TodoListServicesImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();
        }
    }

