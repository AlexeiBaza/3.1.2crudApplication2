package net.proselyte.springbootdemo.repository;

import net.proselyte.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository - некий интерфейс который с помощью Reflection API способен генерировать запросы
//User - класс для которого реализуется JPA репозиторий, Long - тип id
public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstName(String firstName);
}