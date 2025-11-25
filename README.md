# 📘 Estruturas de Dados com Heap — Aplicações Práticas

Este repositório contém exercícios envolvendo **Heaps**, **Filas de Prioridade** e estruturas relacionadas. Além da implementação, este README traz uma explicação leve e prática sobre **onde cada exercício aparece na vida real**, escrita do meu ponto de vista como um estudante de Ciência da Computação que trabalha fora da área e treina à noite.

A ideia é entender **por que isso importa** e **para que serve**, indo além do código.

---

## 🚀 Exercício 1 — Encontrar os K Maiores Elementos

### ✔ O que faz

Dado um array, encontra os **K maiores valores** usando um **Min-Heap**, de forma mais eficiente que ordenar tudo.

### 🎯 Aplicações Reais

* Ranking de jogadores (TOP 10).
* Sistemas de recomendação (pegar conteúdos mais relevantes).
* Monitoramento (CPU, latência, preços mais altos etc.).

### 💬 Explicação simples

> "É como pegar meus 5 maiores PRs da academia. Não preciso organizar todas as cargas que já fiz na vida, só quero os maiores.”

---

## 🚀 Exercício 2 — Mesclagem de K Listas Ordenadas

### ✔ O que faz

Mescla várias listas **que já estão ordenadas** em uma lista única ordenada usando um Min-Heap.

### 🎯 Aplicações Reais

* Motores de busca juntando resultados de diversos servidores.
* Sistemas de logs unificando eventos de vários microsserviços.
* Bancos de dados fazendo merge-sort externo.

### 💬 Explicação simples

> “É como juntar resumos de estudo feitos em dias diferentes. Cada resumo está organizado, mas eu quero tudo junto em ordem.”

---

## 🚀 Exercício 3 — DualPriorityQueue (Min + Max Heap)

### ✔ O que faz

Mantém uma estrutura que retorna **rápido** tanto o **menor** quanto o **maior** valor.

### 🎯 Aplicações Reais

* Sistemas que monitoram valores críticos (temperatura mínima/máxima, maior e menor preço do dia).
* Jogos e simulações (maior dano, menor tempo, maior pontuação).
* Operações bancárias (maior transação, menor saldo).

### 💬 Explicação simples

> “É como olhar meus boletos: o menor me anima, o maior me assusta. Ambos são importantes.”

---

## 🚀 Exercício 4 — Verificação de Min-Heap

### ✔ O que faz

Verifica se um array representa corretamente um **Min-Heap**.

### 🎯 Aplicações Reais

* Garantir integridade de estruturas internas de prioridade.
* Verificar índices de bancos de dados.
* Validar estruturas usadas em compressão de dados.

### 💬 Explicação simples

> “É tipo conferir se meu armário está arrumado: coisas pequenas na frente, grandes atrás. Se algo estiver fora do lugar, já sei que deu ruim.”

---

## 🚀 Exercício 5 — MedianFinder (Mediana em Fluxo de Dados)

### ✔ O que faz

Calcula a **mediana** continuamente enquanto números chegam, usando um Max-Heap e um Min-Heap.

### 🎯 Aplicações Reais

* Apps de saúde (batimentos, passos).
* Monitoramento de tráfego (velocidade mediana dos carros).
* Sistemas financeiros (mediana é mais estável que a média).
* Filtragem de ruído em sensores.

### 💬 Explicação simples

> “É como medir meu progresso na academia: a mediana mostra melhor minha evolução que a média, porque um dia muito ruim ou muito bom não estraga o cálculo.”

---

# 🧠 Conclusão

Mesmo sendo exercícios de estrutura de dados, todos eles representam problemas **muito presentes na vida real**, especialmente em:

* Engenharia de Software
* Data Science
* Sistemas distribuídos
* Apps em tempo real
* Jogos
* Bancos e fintechs

E mesmo para quem trabalha fora da área e estuda quando dá tempo (entre academia, trampo e provas), entender Heap é um passo importante para evoluir como dev e performar bem em entrevistas técnicas.
