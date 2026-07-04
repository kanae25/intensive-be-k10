# Requirements

## Remove Duplicates from Sorted Array

`[1, 1, 2] -> [1, 2]`

## Move Zeros to End

`[0, 1, 0, 3, 4, 5] -> [1, 3, 4, 5, 0, 0]`

## The Feast

![The Feast requirements](requirements/feast.jpg)

## HW OOP 1

Using Scanner to ask user to choose an option:

1. Register
2. View Registered Users
3. Login

### 1. Register

- Let user input: First Name, Last Name, DOB, username, password
- Collect user's info and save to a file named `users.txt`

### 2. View Registered Users

- Ask user to choose options: 1. Show all, 2. Find by name
- 1. Show all → show all users in the file `users.txt`
- 2. Find by name → ask user to input some characters and find users whose FirstName or LastName contains that character → show the users

### 3. Login

- Ask user to input username, password → compare with the users in the file `users.txt`
- If login failed → let user try again 3 times → after 3 tries → account is locked and show message
- If login is successful → show message "Login success" and finish

### When user login is successful

- There is a main menu with 4 options:
  - Register New Card, Deposit, Withdraw, View Balance, View Transaction History, Logout
- User can register a new card number by inserting a new number with 10 digits and choosing a BANK which is provided by a list in the system (system has 3 banks: ANZ, NAB, CMW) if it doesn't exist in the system (`cards.txt` file)
- When user chooses one of these options but they have not input their card number yet → the system will ask them to input their Card Number to process the task they chose. Once they input card info they don't need to re-input again if they choose Yes every time the system asks them "do you want to use current card or not?"
- **Deposit:** User inputs the amount to deposit money to the card. Cards belonging to 2 banks ANZ and NAB can only deposit with money from 10 AUD. Amount below it is prohibited. But CMW bank can deposit with amount from 5 AUD.
- **Withdraw:** User inputs amount to withdraw from their card. ANZ card cannot withdraw over 1000 AUD each time, NAB 2000 AUD, CMW 3000 AUD. Currently all cards must keep 20 AUD and CANNOT withdraw below that.
- **View Balance:** Show the balance of card based on bank name, for example:
  - "Hi Dung, your card balance on NAB bank is XXX"
  - "Your ANZ account YYY balance is XXX"
  - "CMW bank account with number YYY has balance XXX"
- **View Transaction History:** Only NAB bank card owner can see Transaction History within 10 latest ones. Other bank cards not supported yet
- **Logout** → do as it is
