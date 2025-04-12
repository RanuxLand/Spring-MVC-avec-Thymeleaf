package ma.enset.mvcspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;

@Entity
@NoArgsConstructor @Getter
@Setter @AllArgsConstructor @ToString @Builder

public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
