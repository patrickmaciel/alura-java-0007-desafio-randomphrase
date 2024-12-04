package info.patrickmaciel.randomPhrase.randomPhrase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phrases")
public class PhraseController {
  @GetMapping("/random")
  public String getRandomPhrase()
  {
    return "This is a random phrase";
  }
}
