# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

### Documentação do Projeto "JavaiPhoneRolesSimulation"

#### Descrição
Este projeto tem como objetivo modelar e implementar em Java as funcionalidades de um iPhone, representando seus papéis como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. O projeto segue os princípios da Programação Orientada a Objetos (POO) e utiliza interfaces para definir os comportamentos esperados de cada papel.

#### Funcionalidades
O projeto implementa as seguintes funcionalidades:

- **Reprodutor Musical:**
  - `tocar()`: Inicia a reprodução de uma música.
  - `pausar()`: Pausa a reprodução da música.
  - `selecionarMusica(String musica)`: Seleciona uma música para ser reproduzida.

- **Aparelho Telefônico:**
  - `ligarPara(String numero)`: Realiza uma ligação para o número especificado.
  - `atenderChamada()`: Atende uma chamada recebida.
  - `iniciarGravacaoVoz()`: Inicia a gravação de uma mensagem de voz.

- **Navegador na Internet:**
  - `exibirPagina(String url)`: Exibe a página web com a URL especificada.
  - `adicionarNovaAba(String url)`: Adiciona uma nova aba com a URL especificada.
  - `atualizarPagina()`: Atualiza a página web exibida.

- **Funcionalidades Gerais do iPhone:**
  - `ligar()`: Liga o iPhone.
  - `desligar()`: Desliga o iPhone.

#### Estrutura do Projeto
O projeto está organizado da seguinte forma:

```
JavaiPhoneRolesSimulation/
├── iPhone.java
├── ReprodutorMusical.java
├── AparelhoTelefonico.java
├── NavegadorInternet.java
└── TesteiPhone.java
```

- `iPhone.java`: Contém a implementação da classe `iPhone` e suas classes internas que implementam as interfaces.
- `ReprodutorMusical.java`: Define a interface `ReprodutorMusical`.
- `AparelhoTelefonico.java`: Define a interface `AparelhoTelefonico`.
- `NavegadorInternet.java`: Define a interface `NavegadorInternet`.
- `TesteiPhone.java`: Contém a classe de teste para demonstrar o uso do iPhone e suas funcionalidades.

#### Como Executar o Projeto
1. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2. Clone o repositório do projeto: `git clone https://github.com/seu-usuario/JavaiPhoneRolesSimulation.git`
3. Navegue até o diretório do projeto: `cd JavaiPhoneRolesSimulation`
4. Compile o código: `javac *.java`
5. Execute a classe de teste: `java TesteiPhone`

Você deverá ver a saída no console demonstrando o uso das funcionalidades do iPhone.

#### Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
