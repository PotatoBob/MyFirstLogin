package application;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Level {
	int level;
	ArrayList<String> names = new ArrayList<>();
	Color backgroundColor;
	
	void addName(String name) {
	//adds a name to a level
		names.add(name);
	}
	void removeName(String name) {
	//removes a name, if they are  promoted for example
		names.remove(names.indexOf(name));
	}
	void display() {
	//adds the text for the levels to the display
		
	}
	void editName() {
	//lets you change a name in case it's wrong or something
		
	}
	ArrayList<String> getNames() {
		return names;
	}
	Level(int num, Color color) {
		level = num;
		backgroundColor = color;
	}
}
