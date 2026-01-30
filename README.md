# Color Mixer App

## Overview

This is a simple Android app developed in **Kotlin** using **Android Studio**. The app allows users to select two primary colors (Blue, Red, Yellow) and generates the resulting mixed color. It is designed for learning purposes to demonstrate basic Android UI, event handling, and color manipulation.

---

## Features

* Select two primary colors (Color 1 and Color 2).
* Generate the resulting color:

  * Blue + Red → Purple
  * Blue + Yellow → Green
  * Red + Yellow → Orange
* Reset button to clear selections and start over.
* About button to display app creator information.
* Buttons dynamically enable/disable to prevent invalid selections.
* UI reflects color choices through both button and text color.

---

## Screenshots
<img width="891" height="904" alt="Screenshot 2026-01-31 024147" src="https://github.com/user-attachments/assets/c2110d4f-eeef-4e4f-a326-1f1c81f71730" />

<img width="875" height="904" alt="Screenshot 2026-01-31 024133" src="https://github.com/user-attachments/assets/c987e42f-39ad-4993-86a4-82579f473c31" />

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/Prshk1/Color-Mixer-App.git
```

2. Open the project in **Android Studio**.
3. Build and run on an emulator or Android device.

---

## File Structure

* `MainActivity.kt` → Contains the main logic (color selection, generate, reset, About dialog).
* `activity_main.xml` → Defines the app layout (TextViews and Buttons).
* `AndroidManifest.xml` → App configuration.
* `README.md` → Project documentation.

---

## App Logic Overview

1. **Color Selection**

   * User clicks a color button (Blue, Red, or Yellow).
   * First click sets `color1`, second click sets `color2`.
   * Other buttons are disabled after two selections.
   * Generate button is enabled.

2. **Generate Mixed Color**

   * The app checks `color1` and `color2`.
   * Displays the resulting color in the Output TextView.
   * Generate button is disabled after generating.

3. **Reset**

   * Clears `color1` and `color2`.
   * Resets TextViews to default text.
   * Re-enables all color buttons.
   * Disables Generate button until new selections are made.

4. **About**

   * Displays a popup dialog showing the app creator's name and other information.

---

## Learning Points

* Android UI components: TextView, Button, AlertDialog.
* Event handling in Kotlin using `setOnClickListener`.
* Managing button states dynamically with `isEnabled`.
* Using color codes in Android (`Color.parseColor`, `Color.rgb`).
* Conditional logic for color mixing using `if-else`.

---

## Author

**Carl Alfred G. Chan**  
EASTWOODS Professional College of Science and Technology  
BSIT - 405 (SY 2025-2026)
