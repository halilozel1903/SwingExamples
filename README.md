# SwingExamples

A collection of Java Swing GUI examples demonstrating various components and event handling techniques.

## About Swing

`Swing` is a GUI widget toolkit for `Java`. It is part of Oracle's Java Foundation Classes (JFC), an API for providing a graphical user interface for `Java` programs. Swing was developed to provide a more sophisticated set of `GUI` components than the earlier Abstract Window Toolkit (AWT).

## Prerequisites

- Java 8 or higher
- A desktop environment with GUI support (for running the Swing applications)
- Any IDE that supports Java (NetBeans, IntelliJ IDEA, Eclipse) or command line

## Examples Included

### 1. JLabel Example (`JLabel.java`)
Demonstrates the use of JLabel components for displaying text and handling basic GUI events.

### 2. JTextArea Example (`JtextArea.java`)
Shows how to use JTextArea for multi-line text input and display.

### 3. Statistics Application (`Istatistik.java`)
A statistical analysis application demonstrating data visualization and calculation features.

### 4. Mouse Listener Example (`MouseListener.java`)
Illustrates mouse event handling including clicks, movements, and hover effects.

### 5. Key Listener Example (`KeyListener.java`)
Demonstrates keyboard event handling and key press detection.

## How to Compile and Run

### Using Command Line

1. **Compile all examples:**
   ```bash
   javac EventHandlingSwing/*.java
   ```

2. **Run individual examples:**
   ```bash
   # JLabel example
   java EventHandlingSwing.JLabel
   
   # JTextArea example
   java EventHandlingSwing.JtextArea
   
   # Statistics application
   java EventHandlingSwing.Istatistik
   
   # Mouse listener example
   java EventHandlingSwing.MouseListener
   
   # Key listener example
   java EventHandlingSwing.KeyListener
   ```

### Using an IDE

1. Import the project into your IDE
2. Compile the project
3. Run the main class of any example

**Note:** These are GUI applications that require a desktop environment with display support. They will not run in headless environments (servers without GUI).

## Project Structure

```
SwingExamples/
├── .gitignore
├── README.md
└── EventHandlingSwing/
    ├── Istatistik.java       # Statistics application
    ├── Istatistik.form       # NetBeans form file
    ├── JLabel.java           # JLabel example
    ├── JLabel.form           # NetBeans form file
    ├── JtextArea.java        # JTextArea example
    ├── JtextArea.form        # NetBeans form file
    ├── MouseListener.java    # Mouse event handling
    ├── MouseListener.form    # NetBeans form file
    ├── KeyListener.java      # Keyboard event handling
    └── KeyListener.form      # NetBeans form file
```

## Features

- **Event Handling**: Mouse and keyboard event examples
- **GUI Components**: Various Swing components demonstration
- **Form Design**: NetBeans form files included for GUI design
- **Educational**: Perfect for learning Java Swing basics

## Contributing

Feel free to contribute by:
- Adding new Swing examples
- Improving existing code
- Fixing bugs
- Enhancing documentation

## Author

[@halilozel1903](https://github.com/halilozel1903)