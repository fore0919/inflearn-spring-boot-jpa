package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@DiscriminatorValue("B")
public class Book extends Item {
    
    private String author;
    private String isbn;

}
