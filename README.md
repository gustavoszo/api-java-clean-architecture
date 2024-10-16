A Clean Architecture visa separar as preocupações do software em diferentes camadas, garantindo um código modular, testável e de fácil manutenção.

A estrutura do projeto é organizada da seguinte forma:
- Core: Contém as regras de negócio e as entidades. Essa Camada é independente de frameworks ou tecnologias externas, seguindo o principio da inversão de dependência.
- Use Cases e Application: Define as operações que o sistemas oferece. Esses casos de uso orquestram a lógica de negócios.
- Adapters: Contém as interfaces que conectam as camadas exteriores com as camadas mais interiores e interagem com os dados.
- Infra: Integrações com banco de dados e framework(Spring).

Tecnologias Utilizadas:
- Java 21
- Spring Framework(Spring Boot, Spring Data)
- H2 Database
