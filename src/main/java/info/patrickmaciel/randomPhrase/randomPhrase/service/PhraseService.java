package info.patrickmaciel.randomPhrase.randomPhrase.service;

import info.patrickmaciel.randomPhrase.randomPhrase.dto.PhraseDTO;
import info.patrickmaciel.randomPhrase.randomPhrase.mapper.PhraseMapper;
import info.patrickmaciel.randomPhrase.randomPhrase.model.Phrase;
import info.patrickmaciel.randomPhrase.randomPhrase.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService{
  @Autowired
  private PhraseRepository repository;

  @Autowired
  private PhraseMapper mapper;

  public PhraseDTO getRandomNew()
  {
    Phrase randomPhrase = repository.getRandom();
    return new PhraseDTO(randomPhrase.toString());
  }

  public PhraseDTO getRandomMapper()
  {
    Phrase randomPhrase = repository.getRandom();
    return mapper.toDto(randomPhrase);
  }
}
