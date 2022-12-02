package com.daycodeur.controller;

import com.daycodeur.infrastructure.service.EuroMillionsNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class EuroMillionsController {

  private final EuroMillionsNumberGenerator euroMillionsNumberGenerator;

  @Autowired
  public EuroMillionsController(final EuroMillionsNumberGenerator euroMillionsNumberGenerator) {
    this.euroMillionsNumberGenerator = euroMillionsNumberGenerator;
  }

  @GetMapping
  public List<Integer> getRandomNumber() {
    return euroMillionsNumberGenerator.generate();
  }


}
