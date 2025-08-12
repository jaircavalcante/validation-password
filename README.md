# validation-password

# Validação de Senha - API

API simples para validar senhas usando múltiplas regras de validação implementadas como componentes Spring.

Cada regra é uma classe isolada que implementa a mesma interface PasswordRule.
Um validador central (PasswordValidator) recebe uma lista de regras ativas.
A lista de regras vem de configuração externa (application.yml), evitando hardcoding.
Você pode adicionar novas regras sem alterar o core (OCP — Open/Closed Principle).

---

## Como funciona

- Cada regra de validação implementa a interface `PasswordValidation` e é anotada com `@Component`.
- O serviço `PasswordValidationService` injeta todas as regras automaticamente e executa uma a uma.
- O controller `PasswordController` recebe a requisição, chama o serviço e retorna o resultado.

---

## Endpoints

### POST /api/validations

Valida a senha enviada no corpo da requisição.

**Request**

- Content-Type: `application/json`
- Body:

```json
{
  "password": "suaSenhaAqui"
}


