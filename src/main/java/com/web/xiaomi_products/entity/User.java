package com.web.xiaomi_products.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Collection;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Pattern(regexp = "^[A-Za-z0-9_.]+$", message = "Использованы недопустимые символы")
    @Size(min=5, message = "Минимальная длинна логина - 5 символов")
    @Column(name = "username")
    private String username;

    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "Недопустимые символы в пароле")
    @Size(min=4, message = "Пароль должен содержать не менее 4 символов")
    @NotNull
    @Column(name = "password")
    private String password;

    @Transient
    private String passwordConfirm;

    @Pattern(regexp = "^[A-Za-zА-Яа-я-]+$", message = "Использованы недопустимые символы")
    @Size(min=2, message = "Фамилия должна быть не менее 2 символов")
    @Column(name = "lastname")
    private String lastname;

    @Pattern(regexp = "^[A-Za-zА-Яа-я-]+$", message = "Использованы недопустимые символы")
    @Size(min=2, message = "Имя должно быть не менее 2 символов")
    @Column(name = "firstname")
    private String firstname;

    @Email(message = "Неверно введен e-mail")
    @NotBlank(message = "Поле не должно быть пустым")
    @Column(name = "email")
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

    public User() {
    }

    public User(int id, String username, String password, String lastname, String firstname, String email, Collection<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.roles = roles;
    }


    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
