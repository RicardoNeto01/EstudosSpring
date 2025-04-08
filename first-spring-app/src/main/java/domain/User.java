package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Anotações para classe já vir com getter, setters e contrutor
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String email;
    private String name;

}
