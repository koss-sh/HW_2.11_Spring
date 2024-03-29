package pro.sky.HW_2._Spring.service;

import org.springframework.stereotype.Service;
import pro.sky.HW_2._Spring.model.Basket;
import pro.sky.HW_2._Spring.model.Item;
import pro.sky.HW_2._Spring.repository.StoreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Basket basket;
    private final StoreRepository storeRepository;

    public StoreService(Basket basket, StoreRepository storeRepository) {
        this.basket = basket;
        this.storeRepository = storeRepository;
    }
    public void add(Set<Integer> ids){
        basket.add(ids);
    }
    public List<Item> get(){
        return  basket.get().stream()
                .map(id -> storeRepository.get(id))
                .collect(Collectors.toList());
    }
}
