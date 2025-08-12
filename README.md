# validation-password

# Validação de Senha - API

API simples para validar senhas usando múltiplas regras de validação implementadas como componentes Spring.

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


