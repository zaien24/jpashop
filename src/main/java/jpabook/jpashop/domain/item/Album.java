package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@DiscriminatorColumn("A")
@Getter
@Setter
public class Album extends Item {

    private String artist;
    private String etc;
}
