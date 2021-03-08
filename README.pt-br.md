# Cross testing mobile with Java + Appium + Cucumber

*Leia em outros idiomas: [Português](README.pt-br.md) e [Inglês](README.md).*

Estrutura criada para estudos onde o principal objetiva era criar uma arquitetura para
que em um único cenário bdd, se possa executar os testar para Android e iOS, inclusive utilizando a mesma implementação de steps.

## Ferramentas utilizadas

- Java
- Junit
- Cucumber
- Appium
- Maven
- Allure Report

## Execução
Para executar criamos um argumento chamado **platform** para ele podemos passar **ANDROID** ou **IOS**:

Para executar para Android: `mvn test -Dplatform=ANDROID`  
Para executar para iOS: `mvn test -Dplatform=IOS`