# DESAFIO: Insertion Sort em Lista Dinâmica

- **Autor:** Yuji
- **GitHub:** https://github.com/ReverseYuji049/desafio-insertion_sort.git

---

# Sobre o Projeto

Este projeto implementa o algoritmo **Insertion Sort** utilizando uma **lista dinâmica (lista encadeada)** em Java.

O objetivo é demonstrar o funcionamento da ordenação diretamente com ponteiros, sem uso de arrays.

---

# Como funciona o algoritmo

O **Insertion Sort** percorre a lista original e insere cada elemento na posição correta em uma nova lista ordenada.

---

## Exemplo

Lista original:

```
1 → 3 → 5 → 8 → 6
```

Resultado esperado:

```
1 → 3 → 5 → 6 → 8
```

---

# Estrutura do Algoritmo

## Verificações iniciais

### Lista vazia

```java
if (inicioVazio()) {
    System.out.println("A lista está vazia!");
    return;
}
```

### Lista com um único elemento

```java
private boolean umElemento() {
    return this.inicio != null && this.inicio.getProx() == null;
}
```

```java
if (umElemento()) {
    System.out.println("A lista só tem um elemento!");
    return;
}
```

---

## Variáveis principais

```java
No atual = inicio;      // percorre a lista original
No ordenado = null;     // nova lista ordenada
```

---

## Processo de ordenação

Enquanto houver elementos:

```java
while (atual != null)
```

### 1. Guardar próximo nó

```java
No proximo = atual.getProx();
```

---

### 2. Inserção no início da lista ordenada

```java
if (ordenado == null || atual.getConteudo() < ordenado.getConteudo()) {
    atual.setProx(ordenado);
    ordenado = atual;
}
```

---

### 3. Inserção no meio ou final

```java
else {
    No aux = ordenado;

    while (aux.getProx() != null &&
           aux.getProx().getConteudo() < atual.getConteudo()) {
        aux = aux.getProx();
    }

    atual.setProx(aux.getProx());
    aux.setProx(atual);
}
```

---

### 4. Avançar na lista

```java
atual = proximo;
```

---

### 5. Atualizar lista original

```java
this.inicio = ordenado;
```

---

# Implementação

```java
public void insertionSort() {
    if (inicioVazio()) {
        System.out.println("A lista está vazia!");
        return;
    }

    if (umElemento()) {
        System.out.println("A lista só tem um elemento!");
        return;
    }

    No atual = inicio;
    No ordenado = null;

    while (atual != null) {
        No proximo = atual.getProx();

        if (ordenado == null || atual.getConteudo() < ordenado.getConteudo()) {
            atual.setProx(ordenado);
            ordenado = atual;
        } else {
            No aux = ordenado;

            while (aux.getProx() != null &&
                   aux.getProx().getConteudo() < atual.getConteudo()) {
                aux = aux.getProx();
            }

            atual.setProx(aux.getProx());
            aux.setProx(atual);
        }

        atual = proximo;
    }

    this.inicio = ordenado;
}
```

---

# Testes Implementados

O programa inclui diversos cenários de teste:

* - Lista comum
* - Lista em ordem decrescente
* - Lista vazia
* - Lista com um elemento
* - Lista já ordenada
* - Lista desordenada
* - Elementos repetidos
* - Números negativos
* - Todos os elementos iguais
* - Dois elementos invertidos

---

# Execução

```java
static void main() {
    
    ListaDinamicaInsertion insertion = new ListaDinamicaInsertion();
    
    insertion.adicionarElemento(1);
    insertion.adicionarElemento(3);
    insertion.adicionarElemento(5);
    insertion.adicionarElemento(8);
    insertion.adicionarElemento(6); //atual
    insertion.exibir();
    System.out.println("=== INSERTION SORT ===");
    insertion.insertionSort();
    insertion.exibir();
}
```

---

# Complexidade

| Caso        | Complexidade |
| ----------- | ------------ |
| Melhor caso | O(n)         |
| Caso médio  | O(n²)        |
| Pior caso   | O(n²)        |

---

# Conclusão

Este projeto demonstra:

* Manipulação de **listas encadeadas**
* Uso de **ponteiros**
* Implementação manual de algoritmos de ordenação

É uma excelente prática para consolidar estruturas de dados e lógica de programação.

---

# Observações

* O algoritmo ordena em **ordem crescente**
* Não utiliza estruturas auxiliares como arrays
* Trabalha diretamente com **referências de nós**

---

# Contato

Caso queira trocar ideias ou sugerir melhorias, acesse o repositório no GitHub: 
https://github.com/ReverseYuji049/desafio-insertion_sort 
