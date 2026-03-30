# Project Structure

This document explains how the project is organized.

---

## Root Directory

- README.md → Project overview
- CHANGELOG.md → Track all changes
- docs/ → Documentation
- design/ → Game design files
- story/ → Narrative and dialogue
- assets/ → Images and visual assets
- audio/ → Sounds and music
- ui/ → Interface designs and mockups
- src/ → Source code
- data/ → Game data (JSON files)
- builds/ → Exported versions
- tests/ → Testing and bug tracking

---

## src/

Contains all game code. Whici is split between my personal 2D game development library, called CoffeeLib and the game itself, called Coffee-Machine Interface, CMF for short.

### CoffeeLib (2D Game Library)



### Coffee-Machine Interface



---

## story/

Contains all narrative content.

- characters/ → Character descriptions
- dialogues/ → Scene dialogues (JSON)
- branching/ → Choice maps

---

## data/

Game configuration files.

- drinks.json → Recipes
- ingredients.json → Ingredients list
- characters.json → Character data

---

## Guidelines

- Do not mix assets, code and resources together.
- Keep data separate from logic
- Use consistent naming conventions