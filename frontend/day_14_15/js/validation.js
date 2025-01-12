function login() {
   
    // You can perform login validation and authentication here
    // For simplicity, let's just display an alert
    const username=document.getElementById('loginUsername').value;
    const password=document.getElementById('loginPassword').value;

    if(!username || !password){
        alert('All fields are required.');
        return;
    }

    // var usernameRegex = /^[a-zA-Z0-9]+$/;

    // if(!usernameRegex.test(username)){
    //     alert("Username should not contain special characters.");
    //     return;
    // }

    // var passwordRegex = /^(?=.*[A-Z])(?=.*\d)[A-Za-z\d]{8,}$/; 
    // // Check if the password meets the criteria 
    // if(!passwordRegex.test(password)) {
    //      alert("Password must be at least 8 characters long, contain at least one capital letter, and at least one numeric digit."); 
    //     return; 
    // }

    console.log('Username:',username);
    console.log('Password:',password);

    alert('Login Successful');    

    
}

function register() {

    const name=document.getElementById('registerName').value.trim();
    const email=document.getElementById('registerEmail').value.trim();
    const username=document.getElementById('registerUsername').value.trim();
    const password=document.getElementById('registerPassword').value.trim();

    if(!name || !email || !username || !password){
        alert('All fields are required.');
        return;
    }

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(!emailRegex.test(email)){
        alert("Invalid email format.");
        return;
    }

    const usernameRegex = /^[a-zA-Z0-9]+$/;

    if(!usernameRegex.test(username)){
        alert("Username should not contain special characters.");
        return;
    }

    const passwordRegex = /^(?=.*[A-Z])(?=.*\d)[A-Za-z\d]{8,}$/; 
    // Check if the password meets the criteria 
    if(!passwordRegex.test(password)) {
         alert("Password must be at least 8 characters long, contain at least one capital letter, and at least one numeric digit."); 
        return; 
    }

    console.log('Name:',name);
    console.log('Email:',email);
    console.log('Username:',username);
    console.log('Password:',password);

    alert('Registration Successful');
    
    
   

    // Frontend validation for registration form
    

    // Validate email format
    
    // Validate username (no special characters)
    

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    
}
module.exports = { login, register };
