package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

//    public List<Order> findAllByString(OrderSearch orderSearch) {
//    }

//    public List<Order> findAll(OrderSearch orderSearch) {
//
//    }

    public List<Order> findAllWithMemberDelivery() {
        return em.createQuery(
                                "select o from Order o" +
                                        " join fetch o.member m" +
                                        " join fetch o.delivery d", Order.class
        ).getResultList();
    }


}
