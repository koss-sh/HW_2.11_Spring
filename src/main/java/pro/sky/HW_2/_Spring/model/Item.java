package pro.sky.HW_2._Spring.model;

public class Item {
    private int id;
    private String title;

    public Item() {
    }

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
