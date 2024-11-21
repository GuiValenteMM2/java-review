import java.util.List;

public class Persistance {

    private List<Todo> storage;

    public String getTodos() {
        String result = "";
        for (int i = 0; i < storage.size(); i++) {
            result.concat(storage.get(i).toString() + " \n");
        }
        return result;
    }

    public void postTodos(Todo newTodo) {
        storage.add(newTodo);
    }

    public void putTodo(int id, Todo newTodo) {
        storage.removeIf(todo -> todo.getId() == id);
        storage.add(newTodo);
    }

    public void removeTodo(int id) {
        storage.removeIf(todo -> todo.getId() == id);
    }
}
