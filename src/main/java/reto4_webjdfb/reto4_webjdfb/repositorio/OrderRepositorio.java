package reto4_webjdfb.reto4_webjdfb.repositorio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto4_webjdfb.reto4_webjdfb.interfaces.interfaceOrder;
import reto4_webjdfb.reto4_webjdfb.modelo.Order;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositorio {

    @Autowired
    private interfaceOrder orderCrudRepository;

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }

    public Optional<Order> lastUserId(){
        return orderCrudRepository.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return orderCrudRepository.findByZone(zona);
    }

}
