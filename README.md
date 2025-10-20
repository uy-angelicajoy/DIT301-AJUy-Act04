## How did you implement event handling for user actions?
- I implemented event handling using the setOnClickListener method for the Submit button. When the user clicks the button,
  the app retrieves the input from the text fields, validates the data, and displays a response message in the TextView.
  A try-catch block was also used to handle invalid or non-numeric inputs, preventing the app from crashing.

## What techniques ensured smooth and stable interaction?
- To ensure smooth and stable interaction, I added input validation and clear feedback mechanisms using
  Toast and Snackbar messages. These messages instantly inform the user about missing or incorrect inputs,
  helping maintain a consistent and error-free experience. ConstraintLayout was used to keep the UI stable across different screen sizes and orientations.

## What improvements would you add in future versions?
- For future versions, I would like to:

- Add real-time validation while typing to provide instant feedback.

- Improve the visual design using Material Design components and color themes.

- Save user inputs and results for better usability.

- Add localization support for multiple languages.
