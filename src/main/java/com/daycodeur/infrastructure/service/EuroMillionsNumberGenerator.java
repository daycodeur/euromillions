package com.daycodeur.infrastructure.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EuroMillionsNumberGenerator {

  public List<Integer> generate() {
    List<Integer> generatedNumbers = new ArrayList<>();
    List<Integer> generatedBonuses = new ArrayList<>();
    List<Integer> game = new ArrayList<>();

    while (generatedNumbers.size() < 5) {
      double randomDouble = Math.random() * 50;
      int randomInt = (int) randomDouble + 1;
      if (!generatedNumbers.contains(randomInt)) {
        generatedNumbers.add(randomInt);
      }
    }
    List<Integer> sortedNumbers = generatedNumbers.stream().sorted().collect(Collectors.toList());

    while (generatedBonuses.size() < 2) {
      double randomDouble = Math.random() * 12;
      int randomInt = (int) randomDouble + 1;
      if (!generatedBonuses.contains(randomInt)) {
        generatedBonuses.add(randomInt);
      }
    }

    List<Integer> sortedBonuses = generatedBonuses.stream().sorted().collect(Collectors.toList());

    game.addAll(sortedNumbers);
    game.addAll(sortedBonuses);

    return game;
  }

}
