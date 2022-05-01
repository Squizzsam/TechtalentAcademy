const kelvin=293; 
//set variable for kelvin to constant
var celsius = kelvin-273;
//take away 273 to make new variable celsius
var fahrenheit= celsius*(9/5)+32;
//setting fahrenheit variable to be worked out via equation
var fahrenheit=Math.floor(fahrenheit);
//round down fahrenheit, think i got this wrong about five tries but, we got there
console.log(`The temperature is ${fahrenheit} degrees fahrenheit.`);