``` mermaid
classDiagram

class iPhone {
  + tocarMusica()
  + pausarMusica()
  + selecionarMusica()
  + ligar()
  + atender()
  + iniciarCorreioVoz()
  + exibirPagina()
  + adicionarNovaAba()
  + atualizarPagina()
}

class Reprodutor {
  + tocarMusica()
  + pausarMusica()
  + selecionarMusica()
}

class Telefone {
  + ligar()
  + atender()
  + iniciarCorreioVoz()
}

class Navegador {
  + exibirPagina()
  + adicionarNovaAba()
  + atualizarPagina()
}

iPhone..> Reprodutor
iPhone..> Telefone
iPhone..> Navegador
```