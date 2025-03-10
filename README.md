# Order Service - Desafio Spring Boot

Este projeto consiste em uma aplicação simples desenvolvida com **Spring Boot** para calcular o valor total de um pedido com desconto e o custo do frete baseado no valor do pedido.

## 📌 Funcionalidades

- Cadastro de um pedido informando código, valor básico e desconto.
- Cálculo do valor total do pedido considerando o desconto aplicado.
- Cálculo do valor do frete baseado no valor básico do pedido.
- Impressão do código do pedido e do valor total final.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Framework**

## 🔥 Estrutura do Projeto

O projeto é composto pelos seguintes arquivos principais:

### 📂 Entidade
- **`Order.java`**: Representa a entidade do pedido, contendo os atributos `code`, `basic` (valor básico) e `discount` (percentual de desconto).

### 🛠 Serviços
- **`OrderService.java`**: Responsável por calcular o valor total do pedido considerando o desconto aplicado.
- **`ShippingService.java`**: Define a lógica para calcular o valor do frete com base no valor do pedido.

### 🚀 Aplicação Principal
- **`DemoApplication.java`**: Classe principal que recebe entradas do usuário e exibe o resultado final do pedido.

## 📌 Lógica de Cálculo

### 📍 Cálculo do Desconto
O valor final do pedido é calculado como:

```
valor_total = valor_básico - (valor_básico * desconto / 100)
```

### 📍 Cálculo do Frete
- Se o valor básico for **menor que R$100,00**, o frete custa **R$20,00**.
- Se o valor básico for **entre R$100,00 e R$199,99**, o frete custa **R$12,00**.
- Se o valor básico for **R$200,00 ou mais**, o frete é **grátis (R$0,00)**.

## 🛠️ Como Executar o Projeto

### Pré-requisitos:
- **Java 17** instalado
- **Maven** instalado

### Passos para execução:
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/order-service.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd order-service
   ```
3. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
4. Insira os dados do pedido no terminal conforme solicitado.

## 🎯 Exemplo de Execução

**Entrada:**
```
Escreva o código: 101
Escreva o valor básico: 150.00
Escreva o desconto: 10
```

**Saída:**
```
Pedido código 101
Valor Total: R$ 147.00
```

## 📝 Observações
- A aplicação é executada no terminal e utiliza **Scanner** para entrada de dados.
- Não há persistência de dados, pois o foco do projeto é a lógica de negócios.




