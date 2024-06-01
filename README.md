# Princípios SOLID Aplicados em Java

## 1. Single Responsibility Principle (SRP)
Cada classe deve ter uma única responsabilidade ou motivo para mudar. Isso facilita a manutenção e evolução do código.

- **Exemplo:** 
  - Classe `Car` representa o carro.
  - Classe `PriceCalculator` calcula preços.
  - Classe `InventoryManager` gerencia o inventário.

## 2. Open/Closed Principle (OCP)
Classes devem estar abertas para extensão, mas fechadas para modificação. Novas funcionalidades devem ser adicionadas através da extensão, sem modificar o código existente.

- **Exemplo:** 
  - Interface `Vehicle` com método `calculateMaintenanceCost`.
  - Implementações: `Car`, `Truck`, `Motorcycle` com diferentes cálculos de custo.
  - Nova classe `Bus` adicionada sem modificar as classes existentes.

## 3. Liskov Substitution Principle (LSP)
Subtipos devem ser substituíveis por seus tipos base sem alterar a corretude do programa. As subclasses devem poder ser usadas no lugar das classes base.

- **Exemplo:** 
  - Classe base `Vehicle` com métodos `startEngine`, `stopEngine` e `calculateMaintenanceCost`.
  - Subclasses: `Car` e `Truck` que implementam esses métodos e adicionam funcionalidades específicas.

## 4. Interface Segregation Principle (ISP)
Interfaces específicas são melhores que interfaces gerais. Classes não devem ser forçadas a implementar métodos que não utilizam.

- **Exemplo:** 
  - Interfaces: `EngineTemperatureSensor`, `FuelLevelSensor`, `TirePressureSensor`.
  - Implementações específicas para cada tipo de sensor, evitando interfaces grandes e complexas.

## 5. Dependency Inversion Principle (DIP)
Dependa de abstrações, não de implementações. Classes de alto nível não devem depender de classes de baixo nível, ambas devem depender de abstrações.

- **Exemplo:** 
  - Interface `GPSNavigator` com método `getRoute`.
  - Implementações: `BasicGPSNavigator` e `AdvancedGPSNavigator`.
  - Classe `NavigationSystem` que depende da interface `GPSNavigator` e não de implementações concretas.
