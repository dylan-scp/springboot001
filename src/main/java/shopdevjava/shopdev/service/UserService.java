package shopdevjava.shopdev.service;

import java.util.List;

import shopdevjava.shopdev.entity.user.UserEntity;

public interface UserService {
  UserEntity createUser(UserEntity user);
  List<UserEntity> getAllUsers();
}