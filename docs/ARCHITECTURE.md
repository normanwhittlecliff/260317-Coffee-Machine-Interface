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

Contains all game code.

- core/ → Main systems (game loop, scene manager)
- systems/ → Dialogue, coffee machine, choices
- ui/ → UI logic and components
- data/ → Data loaders

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