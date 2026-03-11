package shopdevjava.shopdev.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import shopdevjava.shopdev.entity.user.UserEntity;

 public interface UserService {
  UserEntity createUser(UserEntity user);
  UserEntity getUserById(Long id);
  Page<UserEntity> getByUserNames(String username, Pageable pageable);
}