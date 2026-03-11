package shopdevjava.shopdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shopdevjava.shopdev.entity.user.UserEntity;
import shopdevjava.shopdev.service.UserService;

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    @GetMapping("/get-by-id/{id}")
    public UserEntity getById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/get-by-username")
    public Page<UserEntity> getByUserNames(@RequestParam String userName, @RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userService.getByUserNames(userName, pageable);
    }   
}
