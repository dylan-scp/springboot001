package shopdevjava.shopdev.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
  
  @Value("${player.username}") 
  private String username;

  @Value("${player.age}")
  private int age;

  @Value("${player.address}")
  private String address;
  
  @Value("${player.email}")
  private String email;

  @GetMapping("/v1/api/player/1")
  public String getPlayer() {
    return "Player: " + username + ", Age: " + age + ", Address: " + address + ", Email: " + email;
  }
}
