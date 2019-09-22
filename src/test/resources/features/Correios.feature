# language: pt
Funcionalidade: Correios
  Requisições de endereço

  @Cep
  Cenario: 00001 : Correios
    Dado que envio um CEP valido "06414007"
    Quando recebo codigo de sucesso
    Entao valido os dados do endereco
