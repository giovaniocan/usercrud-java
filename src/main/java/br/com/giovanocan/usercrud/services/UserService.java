package br.com.giovanocan.usercrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.giovanocan.usercrud.dto.UserDTO;
import br.com.giovanocan.usercrud.entities.User;
import br.com.giovanocan.usercrud.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id) {
       User entity = repository.findById(id).get();
       UserDTO dto = new UserDTO(entity);
       return dto;
    }

    

}
