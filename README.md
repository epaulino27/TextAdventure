# TextAdventure
Presentation, Gaming Example with OOD

## Description
This project demonstrates how design patterns are used in games demonstrated on a text-based game.

## Design Patterns Implemented

### 1. Factory
Includes Fightable abstract class, EnemyFactory,and concrete enemy classes GiantBat,Kraken, and WildBoar. EnemyFactory Enemy takes an environment type(water,forest,cave) and makes corresponding enemy(Kraken,Boar,Bat).

### 2. Singleton
In a game the environment needs to be consistent which is why we use only one instance that all other components refer to. To have the Singleton thread-safe and we have 3 checks-> the check if the instance esxists, the synchronisation if there is no instance and the third check, checks the existence agin, just to make sure, there has not another instance been created. Lastly, we have getters and setters that allow the other parts of the game to read or change the current environment, like switching from 'water' to 'forest'.

### 3. Command
encapsulates attack, into a a command interface, called via CommandInvoker

### 4. Observer


## Features
- can create 3 types of enemies: Boar, Bat, Kraken based on environment
- can simulate a fight between players and enemies
- can simulate loot drops

## Requirements 
- JDK 8 or higher
- No external libraries needed

## Usage
Demo simulates a simple fight in which the player attacks enemy until it dies and drops loot.

## Example Output
Player is attacking!
Enemy dodged, Player has missed!

Player is attacking!
Player has hit the enemy!
Enemy health at 10

Player is attacking!
Player has hit the enemy!
Enemy health at 0
The GiantBat has been defeated!
Loot Drop: Player found gold coins!

## Authors
Esperanza, Hugo, Hayden, Annika
