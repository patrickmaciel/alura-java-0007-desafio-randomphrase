package info.patrickmaciel.randomPhrase.randomPhrase.controller;

import info.patrickmaciel.randomPhrase.randomPhrase.dto.PhraseDTO;
import info.patrickmaciel.randomPhrase.randomPhrase.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phrases")
public class PhraseController {
  @Autowired
  private PhraseService service;


  @GetMapping("/random-new")
  public PhraseDTO getRandomPhraseNew()
  {
    return service.getRandomNew();
  }

  @GetMapping("/random-mapper")
  public PhraseDTO getRandomPhraseMapper()
  {
    return service.getRandomMapper();
  }
}
