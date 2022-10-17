package spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.crud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
