package by.kliashtorny.business;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    private final RestTemplate restTemplate;
    private static final String currenciesNBRBUri = "https://www.nbrb.by/api/exrates/currencies";

    @GetMapping("/list")
    public ResponseEntity<String> getCurrency() {
        String currencyList = restTemplate.getForObject(currenciesNBRBUri, String.class);
        return ResponseEntity.ok(currencyList);
    }
}
