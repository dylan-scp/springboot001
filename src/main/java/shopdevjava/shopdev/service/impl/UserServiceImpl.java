package shopdevjava.shopdev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import shopdevjava.shopdev.entity.user.UserEntity;
import shopdevjava.shopdev.repository.UserRepository;
import shopdevjava.shopdev.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Page<UserEntity> getByUserNames(String username, Pageable pageable) {
      return userRepository.findByUserName(username, pageable);
    }
  
  
}