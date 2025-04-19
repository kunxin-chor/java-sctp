const prompt = require('prompt-sync')()
const name = prompt("Please enter your name: ");
const email = prompt("Enter your email address: ");
let person = {
    "name": name,
    "email": email
}