# Java Spring MVC Form Handling Example

This is a simple Java Spring MVC project that demonstrates how to handle form submissions using Spring Boot. The project includes a basic web interface where users can fill out a form and receive a response based on their input.

## Project Structure

The project is organized as follows:

- **src/main/java/ca/sheridancollege/daksh/controllers/MainController.java**: Contains the main controller that handles HTTP requests and form submissions.
- **src/main/resources/templates/index.html**: The homepage of the application, which includes a link to the form page.
- **src/main/resources/templates/javaFun.html**: The form page where users can provide their input.

## Functionality

- **Homepage**: The homepage welcomes the user and provides a link to the form page.
- **Form Page**: The form asks the user whether they think Java is fun, if they want to be added to the mailing list, and collects their name and email address.
- **Form Submission**: Upon form submission, the user is presented with a custom response based on their input.

### Main Features

- **Radio Button**: Users can select whether they think Java is fun ("Yes" or "No").
- **Checkbox**: Users can choose to be added to a mailing list.
- **Text Inputs**: Users can enter their name and email address.

### Controllers

- **MainController.java**:
  - `indexPage()`: Handles GET requests for the root URL ("/") and returns the `index.html` page.
  - `formPage()`: Handles GET requests for `/formPage` and returns the `javaFun.html` page.
  - `formPage(HttpServletResponse response, @RequestParam String radio, @RequestParam (required = false) boolean checkbox, @RequestParam String name, @RequestParam String email)`: Handles POST requests for `/formPost`. Processes the form data and generates a custom response based on the user's input.

### HTML Pages

- **index.html**: The main landing page with a welcome message and a link to the form page.
- **javaFun.html**: The form page where the user interacts with the application by providing input.

## How to Run

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
3. Make sure you have Java and Maven installed.
4. Run the project as a Spring Boot application.
5. Open your web browser and navigate to `http://localhost:8080` to access the homepage.

## Example

- **Home Page**: A welcome message with a link to the form page.
- **Form Page**: The user answers whether they think Java is fun, decides whether to join the mailing list, and submits their name and email.
- **Response**: The user receives a custom response message based on their input.

## Dependencies

This project requires the following dependencies:

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf (or any other template engine you may use)
- Spring Boot Starter Test (for unit testing)

## Future Enhancements

- Add validation to form inputs.
- Enhance the UI with more styling and feedback messages.
- Implement database integration to store form submissions.

## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute as you like.

