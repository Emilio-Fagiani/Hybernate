package it.develhope.Hybernate.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String firstname;
    @NotNull
    private String lastName;
}
