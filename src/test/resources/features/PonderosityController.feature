# language: pt
Funcionalidade: Ponderosity Controller
  Requisições de Ponderosity Controllervv

  @82431 @Massa
  Cenario: 82431: POST - Criacão de parametrizacão de peso não existente com status Ativo para combinacão Tipo-Canal-Produto
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão deve ser criada com sucesso

  @82432 @Pronto @Teste
  Cenario: 82432: POST - Criacão de parametrizacão de peso já existente e ativa para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82433 @Massa
  Cenario: 82433: POST - Criacão de parametrizacão de peso não existente com status Inativo para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Inativo"
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão deve ser criada com sucesso

  @82434 @Pronto @Mensagem
  Cenario: 82434: POST - Criacão de parametrizacão de peso já existente porém inativa para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    E o campo Status na requisicão for "Inativo"
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82435 @Pronto 
  Cenario: 82435: POST - Criacão de parametrizacão de peso não existente com peso maior que 100 para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Mas o peso preenchido é maior que 100
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82436 @Massa
  Cenario: 82436: POST - Criacão de parametrizacão de peso não existente com indicador impeditivo para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    E o indicador de impeditivo está marcado com Sim
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão deve ser criada com sucesso

  @82437 @Pronto
  Cenario: 82437: POST - Criacão de parametrizacão de peso não existente para combinacão tipo-canal-produto porém Tipo de Score não encontrado
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Mas o tipo de score não exista
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82438 @Pronto
  Cenario: 82438: POST - Criacão de parametrizacão de peso não existente para combinacão tipo-canal-produto porém Canal não encontrado
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Mas o canal não exista
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82439 @Pronto
  Cenario: 82439: POST - Criacão de parametrizacão de peso não existente para combinacão tipo-canal-produto porém Produto não encontrado
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Mas o produto não exista
    Quando eu chamar o servico de POST para a criacão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a parametrizacão não deve ser criada

  @82440 @Pronto
  Cenario: 82440: PUT - Alteracão de parametrizacão de peso não existente com status Ativo para combinacão Tipo-Canal-Produto
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então nenhuma alteracão será realizada

  @82441 @Pronto
  Cenario: 82441: PUT - Alteracão de parametrizacão de peso já existente e ativa para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    E o campo Status na requisicão for "Ativo"
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a alteracão será realizada com sucesso

  @82442 @Pronto
  Cenario: 82442: PUT - Alteracão de parametrizacão de peso não existente com status Inativo para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto ainda não exista parametrizacão de peso
    E o campo Status na requisicão for "Inativo"
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então nenhuma alteracão será realizada

  @82443 @Pronto
  Cenario: 82443: PUT - Alteracão de parametrizacão de peso já existente porém inativa para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    E o campo Status na requisicão for "Inativo"
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a alteracão será realizada com sucesso

  @82444 @Pronto
  Cenario: 82444: PUT - Alteracão de parametrizacão de peso existente com peso maior que 100 para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    Mas o peso preenchido é maior que 100
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então nenhuma alteracão será realizada

  @82445 @Pronto
  Cenario: 82445: PUT - Alteracão de parametrizacão de peso existente com indicador impeditivo para combinacão tipo-canal-produto
    Dado que para a combinacão Tipo de Score, Canal e Produto já exista parametrizacão de peso
    E o indicador de impeditivo está marcado com Sim
    Quando eu chamar o servico de PUT para alteracão da parametrizacão de peso com esse tipo de score, canal e produto
    Então a alteracão será realizada com sucesso

  @82449 @Pronto 
  Cenario: 82449: GET - Listar parametrizacões de peso enviando apenas o tipo de score
    Dado que na consulta de listagem apenas o Tipo de Score foi preenchido
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
    Então o servico deve retornar listagem conforme filtro preenchido

  @82450 @Pronto
  Cenario: 82450: GET - Listar parametrizacões de peso enviando apenas o canal
    Dado que na consulta de listagem apenas o Canal foi preenchido
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
    Então o servico deve retornar listagem conforme filtro preenchido

  @82451 @Pronto 
  Cenario: 82451: GET - Listar parametrizacões de peso enviando apenas o produto
    Dado que na consulta de listagem apenas o Produto foi preenchido
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
    Então o servico deve retornar listagem conforme filtro preenchido

  @82452 @Pronto 
  Cenario: 82452: GET - Listar parametrizacões de peso enviando requisicão completa
    Dado que na consulta de listagem todos os parametros foram preenchidos
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
    Então o servico deve retornar listagem conforme filtro preenchido

  @82453 @Pronto 
  Cenario: 82453: GET - Listar parametrizacões de peso sem enviar parametros
    Dado que na consulta de listagem nenhum dos parametros foi preenchido
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
    Então o servico deve retornar listagem conforme filtro preenchido

  @82454 @Pronto 
  Cenario: 82454: GET - Listar parametrizacões de peso enviando requisicão completa com tipo de score inexistente
    Dado que na consulta de listagem todos os parametros foram preenchidos
    Mas o tipo de score não exista
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
		Então o servico deve retornar vazio

  @82455 @Pronto 
  Cenario: 82455: GET - Listar parametrizacões de peso enviando requisicão completa com canal inexistente
    Dado que na consulta de listagem todos os parametros foram preenchidos
    Mas o canal não exista
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
		Então o servico deve retornar vazio

  @82456 @Pronto 
  Cenario: 82456: GET - Listar parametrizacões de peso enviando requisicão completa com produto inexistente
    Dado que na consulta de listagem todos os parametros foram preenchidos
    Mas o produto não exista
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
		Então o servico deve retornar vazio

  @82457 @Pronto 
  Cenario: 82457: GET - Listar parametrizacões de peso enviando requisicão completa - Retorno sem resultados
    Dado que para os parametros preenchidos na consulta não exista nenhuma parametrizacão de peso criada
    Quando eu chamar o servico GET para listagem das parametrizacões de peso existentes
		Então o servico deve retornar vazio
