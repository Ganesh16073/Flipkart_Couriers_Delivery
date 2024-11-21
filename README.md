# Flipkart Shopping Application

This is a Spring-based Java application that simulates a shopping process using dependency injection. The application calculates the bill for purchased items and delegates the delivery process to a courier service, demonstrating the use of Spring's `@Autowired` and `@Qualifier` annotations for dependency management.

## Features

- **Shopping Simulation**: Allows users to "purchase" items with specified prices.
- **Random Order ID Generation**: Creates a unique order ID for each transaction.
- **Courier Service Integration**: Integrates with a courier service for delivery.

## Technology Stack

- **Java**: Core programming language.
- **Spring Framework**: For dependency injection and component management.
- **Maven**: For project management and build automation.

## Code Overview

### Key Components

1. **Flipkart Class**
   - Represents the main shopping service.
   - Uses the `@Autowired` annotation to inject a courier service implementation.

2. **Courier Interface**
   - Provides a method for order delivery.

3. **BlueDart (Courier Implementation)**
   - Implements the `Courier` interface and provides delivery functionality.
