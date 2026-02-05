# Activity 1 – Color Mixer App

This project is an Android application developed for **Free Elective 3: Mobile Computing**. The main purpose of this activity is to learn the **basics of Android development**, focusing on **TextView**, **Buttons**, and **simple conditional logic (`if–else`)** in Kotlin.

The application allows users to select **two primary colors** and generates the resulting mixed color for practice and learning purposes.

---

## Application Overview

The app allows the user to:

* Select a first color (Color 1)
* Select a second color (Color 2)
* Generate the mixed color result
* Reset the app state without restarting
* View developer information via an About dialog

This project is designed for **educational and demonstration purposes**, focusing on basic Android UI components and programming concepts.


---

## Features

* Uses **Buttons** for color selection (Blue, Red, Yellow)
* Displays selected colors using **TextViews**
* Generates color combinations:

  * Blue + Red → Purple
  * Blue + Yellow → Green
  * Red + Yellow → Orange
* Generate button activates only after two colors are selected
* Reset button clears all selections and restores default state
* About dialog displays developer information
* Buttons dynamically enable and disable to guide correct usage

---

## Screenshots

<img width="891" height="904" alt="Screenshot 1" src="https://github.com/user-attachments/assets/c2110d4f-eeef-4e4f-a326-1f1c81f71730" />

<img width="875" height="904" alt="Screenshot 2" src="https://github.com/user-attachments/assets/c987e42f-39ad-4993-86a4-82579f473c31" />

---

## How the Color Mixer Works

1. The user selects a **first color**, which is stored as `color1`.
2. The user selects a **second color**, which is stored as `color2`.
3. After two colors are selected:

   * All color buttons are disabled
   * The Generate button becomes enabled
4. When Generate is pressed:

   * The app checks the color combination using `if–else` statements
   * The resulting mixed color is displayed in the Output TextView
   * The Generate button is disabled to prevent repeated output
5. The Reset button clears all values and restores the app to its initial state.

---

## Technologies Used

* **Android Studio**
* **Kotlin**
* Android SDK

---

## Key Concepts Used

* Android UI components: **TextView** and **Button**
* Button click handling using `setOnClickListener`
* UI updates using `TextView`
* Dynamic enabling and disabling of buttons using `isEnabled`
* Color manipulation using `Color.parseColor` and `Color.rgb`
* Conditional logic with `if–else`

---

## Purpose of the Activity

The main objective of this activity is to:

* Understand the basics of TextView and Button usage in Android
* Learn how to handle button clicks and change UI elements dynamically
* Apply basic conditional logic (`if–else`) to solve a problem
* Build a clean and beginner-friendly Android application

Additional features such as reset functionality and an About dialog were added to improve usability and learning experience.

---

## Developer Information

**Carl Alfred G. Chan**
BSIT – 405
EASTWOODS Professional College of Science and Technology
Free Elective 3: Mobile Computing

---

## Release Information

This repository includes:

* Source code
* APK file for testing and demonstration

This project is intended for **academic submission and learning purposes only**.
