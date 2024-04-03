package br.com.giovanocan.usercrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giovanocan.usercrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
// para extender temos só que definir o tipo ( userEntity), e o tipo do primary key