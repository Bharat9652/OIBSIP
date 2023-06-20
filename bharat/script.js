// Form Validation
document.querySelector("form").addEventListener("submit", function (event) {
  event.preventDefault();
  var nameInput = document.querySelector('input[name="name"]');
  var emailInput = document.querySelector('input[name="email"]');
  var messageInput = document.querySelector('textarea[name="message"]');
  var errorMessages = document.querySelectorAll(".error-message");

  // Clear previous error messages
  errorMessages.forEach(function (element) {
    element.textContent = "";
  });

  // Validate name field
  if (nameInput.value.trim() === "") {
    errorMessages[0].textContent = "Please enter your name";
  }

  // Validate email field
  if (emailInput.value.trim() === "") {
    errorMessages[1].textContent = "Please enter your email";
  } else if (!isValidEmail(emailInput.value.trim())) {
    errorMessages[1].textContent = "Please enter a valid email";
  }

  // Validate message field
  if (messageInput.value.trim() === "") {
    errorMessages[2].textContent = "Please enter your message";
  }

  // Submit the form if there are no errors
  if (errorMessages[0].textContent === "" && errorMessages[1].textContent === "" && errorMessages[2].textContent === "") {
    // Form submission logic goes here
    // You can send the form data to a server or perform any other action
    console.log("Form submitted successfully");
    document.querySelector("form").reset();
  }
});

// Email validation function
function isValidEmail(email) {
  var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return emailRegex.test(email);
}
