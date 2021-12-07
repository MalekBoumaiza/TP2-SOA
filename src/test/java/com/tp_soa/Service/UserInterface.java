package com.tp_soa.Service;

import com.tp_soa.DTO.UserDTO;
import com.tp_soa.Entity.User;

import java.util.List;

public interface UserInterface {
    List<User> List();
    User Save(User user);
    User Get(long id);
    UserDTO Update(Long id, User personne);
    void Delete(long id);
}

