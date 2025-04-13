# desafio-itau-backend
# 1. O Desafio
Consistia no seguinte: Criar uma API REST com os endpoints de /transacao e /estatistica, com cada endpoint possuindo suas próprias restrições para que o desafio fosse concluído, tendo restrições de tipagem de variáveis, e validações para e entrada de dados. Demais informações podem ser conferidas diretamente no repositório do desafio: https://github.com/feltex/desafio-itau-backend

# 2. Tecnologias
- Java 24
- Spring Boot 3.4.4
- Gradle
- Spring Web API
- Spring Validation

# 3. Endpoints

| Método | Endpoint      | Descrição                             |
|:---|:--------------|:--------------------------------------|
| `POST` | `transacao`   | Registra nova transação               |
| `DELETE` | `transacao`   | Apaga registro de transações          |
| `GET` | `estatistica` | Retorna Estatísticas do último minuto |

# 4. Regras de negócio
- Não aceita transações menores do que 0
- A data da transação não pode ser no futuro
- A estastíticas devem ser apenas dos últimos 60 segundos

## 5. Considerações Finais

Este foi meu primeiro desafio de código completo e me sinto super bem! Com certeza devem ter melhoras que podem ser realizadas e que farei em momento oportuno. Foi uma experiência muito enriquecedora em termos de conhecimento e ótima para aprimorar minhas habilidades! Obrigado para quem leu até aqui!