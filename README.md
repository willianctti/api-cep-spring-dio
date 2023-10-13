# api-cep-spring-dio
API - Interface de consumo simples que consome apenas duas informações: Nome e CEP Retorna, porém, várias outras informações. Para saber mais, basta acessar o arquivo "Documentação".txt
<h2> API feita em Java Spring c/ Maven.
Spring Web, JPA, H2 DataBase e FeignClient. </h2>
<h5> Interface de consumo simples que consome apenas duas informações: </h5>
Nome e CEP
Retorna, porém, várias informações como: {
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "80320-280",
    "logradouro": "Rua Professor Zildo Manoel da Cruz",
    "complemento": "",
    "bairro": "Portão",
    "localidade": "Curitiba",
    "uf": "PR",
    "ibge": "4106902",
    "gia": "",
    "siafi": "7535"
  }
}

<h3> projeto feito com a devida precaução em separação de packages e classes.
(controllers, model, services e implementações).
CRUD completo. </h3>

