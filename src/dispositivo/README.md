#### Funcionalidades a Modelar
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
            +tocar()
            +pausar()
            +selecionarMusica(String: musica)
    }
    
    class AparelhoTelefonico {
            +ligar(String: numero)
            +atender()
            +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
            +exibirPagina(String: url)
            +adicionarNovaAba()
            +atualizarPagina()
    }
    
    class Iphone {
    }
    
    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
```
