<!-- 260317 Coffee-Machine Interface — dev_log -->

# DEVELOPMENT LOG

This is where I will keep tabs on what I've been doing and thinking about this projects. It is a one-man game made by Norman, after all. It could be usefull for creating a video or to show to my professor.

# Mar 25, 2026

- Created the project folder and started creating the folders and organizations of the projects.

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

- I decided to use chatGPT for guidance when it comes to folder organization and archtecture.

- Planning on using ChatGPT for optimization, just like I did for the game loop of my last project.

# Mar 27, 2026

I'm splitting the game to my dedicated game development library. Should I keep tabs with different documentations? i don't know. For now, I lewkey need a good name for all of them. For the ganme, since it is a simple college project for Human-Machine Interface (IHM), I might just na e it Coffee-Machine Interface. I might come up with an excuse for this name in the story of the game.

# Mar 29, 2026

I started code and created just a windows. my focus was the GameConfig class and the ability to split all that between the game and the CoffeeLib library.

I created the GameLoop and started working on a Input class.

# Mar 30, 2026 - Implementing the Input class

I was able to implement the Input class I created yesterday with my code. It is working much better than I was expecting. 

All I need is separated the "if" statements for keyboards and mouse some functions and play them according to scenes. 

Thus, when a scene is on screen, the code can automatically update the inputs given. I might do a keyboard map later for easy coding, but also so the user can change what keys do the job.

# Apr 02, 2026 - Game States

After some much needed rest, I am working on this project again. Now I want to add the game states. There is no point on focousing on player, inventory, momevent and stuff like that since this game is going to mainly be focous on clicking and reading.

OI want to set the game states in my engine so I can create them in the game. The main menu, the loading, the settings and the "gameplay" oner. i still need to decided if the phone and coffee-machine will be there own state or a oversscreen thingy.

# Apr 05, 2026 - Game States (Finished)

I finished adding game states. For now, i have decided that each state will be deleted when changed to another. I also made the intro software, main menu and the testing. I assume the gameplay one will be the biggest, and, because of the nature of my states, i will havce to make the Coffee_Machine state be a UI Overlook


# PERSONAL (delete later)

<!-- CHAT GPT

I need to make a game. I choose to make a clicker Coffee Making Story Based game where the story is set on my campus. This game is quite similar to Coffee Talk, where there are scenes that look like a comic page, the cafeteria with characters and balloon text, a system of choices where the player chooses the dialog, a phone with many options and a coffee machine screen where the player need to choose three ingredients to make a drink to serve the characters. This is one of my first big projects, since I'm new to this and game developments, I will need your help. 

I need your help with 


---

Kaarin Java Game Development Playlist:

[ ] #1 

-->
