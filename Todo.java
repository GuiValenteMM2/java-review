public class Todo {
    private int id;
    private String name;
    private String desc;

    Todo(int id, String name, String desc) {
        setId(id);
        setName(name);
        setDesc(desc);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }

    public String toString() {
        return "Name: " + getName() + ", Description: " + getDesc();
    }
}
