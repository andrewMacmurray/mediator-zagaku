# Mediator Zagaku

## A Washing Machine Application

This repo is a contrived example of a Washing Machine application that's got a bit out of hand!

### The Problem

The Washing Machine has a number of different working parts:

+ A `Valve` - (to let water in)
+ A `Motor` - (to spin the washing machine drum)
+ A `Heater` - (to heat the water)
+ A `Sensor` - (to check if the temperature is hot enough)

Each of these components at first seem like separate entities, but each of them need to communicate with each other in some way, for example:

+ When the `Valve` is opened it needs to tell the `Motor` that it can start spinning
+ When the `Motor` has started spinning it needs to tell the `Heater` to heat the water
+ Once the water is hot enough, the `Sensor` needs to tell the `Heater` to switch off
+ After this the `Motor` needs to stop and then the `Valve` can shut after the water has drained.

The sequence of messages is well defined but the hierarchy is messy. This has an unfortunate effect of making it difficult to test as well (a particularly nasty dependency is the `Motor` and the `Valve`, they need to know about each other which creates a cyclic dependency).

### A Solution

Each of these components can be separated from one other using a `Mediator` object. The mediator is then in charge of sequencing the actions of each component. Have a go at refactoring the current application to use a `Mediator`.

#### Hints:

+ Create a `Mediator` class that has a reference to each of the components (`Valve`, `Heater`, `Motor` and `Sensor`)
+ Each of the components should be independent of one another (i.e. remove all references to other components)
+ Run the wash sequence from the mediator

### Bonus

Can you customise the washing machine to run different modes? (e.g. a Cotton Wash or a Delicates Wash).

Compare your solution with the one on the `solution` branch.

### Useful Links

https://refactoring.guru/design-patterns/mediator