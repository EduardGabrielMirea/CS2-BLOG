package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Star {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long S_id;
    private String name;
    private String champion;

}
