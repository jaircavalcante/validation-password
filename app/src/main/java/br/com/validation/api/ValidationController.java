package br.com.validation.api;

import br.com.validation.dto.PasswordRequest;
import br.com.validation.exception.BusinessException;
import br.com.validation.service.PasswordValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/validations")
public class ValidationController {

    private PasswordValidationService service;

    private ValidationController(PasswordValidationService passwordValidationService){
        this.service = passwordValidationService;
    }

    @PostMapping
    public ResponseEntity validate(
            @RequestBody PasswordRequest passwordRequest
    ) throws BusinessException {
        service.validate(passwordRequest.password());
        return ResponseEntity.accepted().build();
    }
}