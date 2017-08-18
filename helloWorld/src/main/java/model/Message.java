// package name
package model;

// name of the class
public class Message {
	private String text;

	public Message(String text) {
		super();
		this.text = text;
	}
// get method the get the message
	public String getText() {
		return text;
	}
// set method the set the message equal to text
	public void setText(String text) {
		this.text = text;
	}
}