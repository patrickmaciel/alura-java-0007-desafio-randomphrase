package info.patrickmaciel.randomPhrase.randomPhrase.mapper;

import info.patrickmaciel.randomPhrase.randomPhrase.dto.PhraseDTO;
import info.patrickmaciel.randomPhrase.randomPhrase.model.Phrase;
import org.springframework.stereotype.Component;

@Component
public class PhraseMapper {
  public PhraseDTO toDto(Phrase phrase) {
    return new PhraseDTO(phrase.getPhrase());
  }
}
