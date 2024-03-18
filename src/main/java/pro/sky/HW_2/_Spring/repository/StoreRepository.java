package pro.sky.HW_2._Spring.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pro.sky.HW_2._Spring.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> storage = new HashMap<>();

    @PostConstruct
    public void init() {
        storage.put(idCounter, new Item(idCounter++, "Laptop"));
        storage.put(idCounter, new Item(idCounter++, "Smartphone"));
        storage.put(idCounter, new Item(idCounter++, "Book"));
    }
    public void add(Item item){
        storage.put(item.getId(), item);
    }
    public Item get(int id){
        return storage.get(id);
    }
    public List<Item> getAll(){
        return new ArrayList<>(storage.values());
    }
    public void update(int id, Item item){
        if (storage.containsKey(id)){
            storage.replace(id, item);
        }
    }
    public Item delete(int id){
       return storage.remove(id);
    }
}
