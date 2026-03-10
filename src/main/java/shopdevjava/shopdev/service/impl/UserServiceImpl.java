package shopdevjava.shopdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import shopdevjava.shopdev.entity.user.UserEntity;
import shopdevjava.shopdev.repository.UserRepository;
import shopdevjava.shopdev.service.UserService;

public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity createUser(UserEntity user) {
    return userRepository.save(user);
  }

  @Override
  public List<UserEntity> getAllUsers() {
    return userRepository.findAll();
  }
}