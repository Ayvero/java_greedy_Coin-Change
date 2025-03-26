# Problema del Cambio de Monedas

## Descripción del Problema
Dado un conjunto **C** de **N** tipos de monedas con un número ilimitado de cada una, el objetivo es determinar el mínimo número de monedas necesarias para formar una cantidad **M**.

Por ejemplo, si un cajero automático tiene billetes de valores: **100$, 25$, 10$, 5$ y 1$**, y se necesita pagar **289$**, la mejor solución consiste en dar **10 billetes**: 
- **2 de 100$**
- **3 de 25$**
- **1 de 10$**
- **4 de 1$**

## Enfoque
- **Algoritmo voraz (Greedy)**: Si las denominaciones lo permiten, se usa un enfoque voraz para seleccionar la moneda más grande posible primero.
- **Programación dinámica**: Si el enfoque voraz no es óptimo, se implementa programación dinámica para garantizar el número mínimo de monedas.
- **Casos límite**: Se consideran situaciones en las que no es posible formar la cantidad **M** exacta.

## Aplicaciones
Este problema es útil en diversas áreas:
- **Sistemas financieros y de pago**: Cajeros automáticos, máquinas expendedoras y transacciones en línea.
- **Algoritmos de optimización**: Asignación eficiente de recursos y problemas de minimización.
- **Teoría de la computación**: Análisis de eficiencia de algoritmos y complejidad computacional.

- -------------------------------------------------------------------------------------

# Coin Change Problem

## Problem Description
Given a set **C** of **N** coin types, with an unlimited supply of each, the goal is to determine the minimum number of coins needed to obtain a total amount **M**. 

For example, if a cash machine has bills of values: **100$, 25$, 10$, 5$, and 1$**, and we need to pay **289$**, the optimal solution is to give **10 bills**: 
- **2 of 100$**
- **3 of 25$**
- **1 of 10$**
- **4 of 1$**

## Approach
- **Greedy Algorithm**: If the coin denominations allow it, use a greedy approach to take the largest possible coin first.
- **Dynamic Programming**: If the greedy approach is not optimal, use dynamic programming to ensure the minimal number of coins is selected.
- **Edge Cases**: Consider cases where it's impossible to make the exact amount **M**.

## Applications
This problem is widely used in:
- **Finance & Payment Systems**: ATM cash withdrawals, vending machines, and online transactions.
- **Optimization Algorithms**: Resource allocation and minimization problems.
- **Theoretical Computer Science**: Algorithm efficiency and computational complexity analysis.

