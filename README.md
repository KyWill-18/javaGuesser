# javaGuesser
### This program with be a Human and Computer number guesser. 


## Menu
```
Print Out Menu

0) Exit 
1) Human Guesser 
2) Computer Guesser 

"Please enter 0-2:"

Scanner needed for user input (userChoice) 
(if invalid input -> "That's not a valid choice please try again" and Reprint Menu
```


## Human Guesser
```
For the Human Guesser, the computer will generate a random number and the user will have to guess.
After a number is guessed the computer will say if the number is too low, too high, or correct.
User will only have a set number of tries to guess the correct number.

Generate a random number (1 - 100) and store it in correctNum
Scanner need for user's guess input which will be stored in userGuess

while keepGoing:

try{ 

if...
userGuess < correctNum:
  print "too low."
  add +1 to tries

else if...
userGuess > correctNum:
  print "too high."
  add +1 to tries

userGuess = correctNum:
  print "you guessed the right number! good job!"
  keepGoing = false

turns = 5:
  keepGoing = false
  print "oh no! you ran out of tries"

```


## Computer Guesser
```
For the Computer Guesser, the user will come up with a random number (1 - 100) and the computer will guess what that number is.
The user will be able to tell the computer if the guess is too low, too high, or correct.
The computer will be able to take that "too low" or "too high" result and adjust the numbers it can guess.
Same as the human guesser the computer will have a set numbers of tries to guess the correct number.

Low 1
High 100

if...
compGuess < userNum:
  add +1 to tries

else if...
compGuess > UserNum:
  add +1 to tries

compGuess = UserNum:
  keepGoing = false

turns = 5:
  print "oh no! i ran out of tries! good game"
  keepGoing = false
```
