package br.com.mauricioricardo.todolist.user;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name="tb_users")
public class UserModel {
    @Id
    private UUID id;
    private String username;
    private String name;
    private String password;

}
