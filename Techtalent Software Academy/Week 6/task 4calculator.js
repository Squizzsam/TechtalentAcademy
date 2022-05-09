let firstValueStr=prompt("first value");
let firstValue= Number(firstValueStr);
let secondValueStr=prompt("second value");
let secondValue=Number(secondValueStr);

let operation=prompt("+,-,*,/or ^")

function addition(firstValue, secondValue){return firstValue+secondValue;}

function subtraction(firstValue, secondValue){return firstValue-secondValue;}

function multiplication(firstValue,secondValue){return firstValue*secondValue;}

function division(firstValue,secondValue){return firstValue/secondValue}

function power(firstValue,secondValue){return firstValue^secondValue}
let answer

switch(operation){
  case"+": answer=addition(firstValue,secondValue);
    break;
  case "-": answer=subtraction(firstValue,secondValue);
    break;
  case "*": answer=multiplication(firstValue,secondValue);
    break;
  case "/": answer=division(firstValue,secondValue);
    break;
  case "^": answer=power(firstValue,secondValue);
    //missed the values in commas? i think this was the issue
  default:console.log("invalid operation")
}

console.log(`${firstValue}${operation}${secondValue}=${answer}`)

//i just cant get this to work