package br.com.validation.service;

import br.com.validation.exception.BusinessException;
import br.com.validation.interfaces.PasswordValidation;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordValidationService {

    private final List<PasswordValidation> rules;

    public PasswordValidationService(List<PasswordValidation> rules) {
        this.rules = rules;
    }

    public void validate(String password) throws BusinessException {
        for (PasswordValidation rule : rules) {
            rule.validate(password);
        }
    }
}
