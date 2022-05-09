var fruits=["Apple","Orange","Banana","Pear","Peach","Strawberry","Cherry","Acai"];

for (let fruit of fruits){
  //think this cycles through the array and adds each value to fruit
  var vowels=0;
  var consonants=0;
//gonna be honest im not 100 percent, how i got this
  fruit.toLowerCase();
  
 
    for(var i=0;i<fruit.length;i++){
     //each time new value added to array into fruit, this loop looks at the letters in each array
if (fruit[i]=="a"){vowels++}
     else if (fruit[i]=="e"){vowels++}
     else if (fruit[i]=="i"){vowels++}
     else if (fruit[i]=="o"){vowels++}
     else if (fruit[i]=="u"){vowels++}
      else consonants++

      // my switch may work now? with alterations to the rest of the code
    

      
/* switch(fruit[i]){
  case"a": vowels++
  break;
  case"A": vowels++
  break;
  case"e": vowels++
  break;
  case"E": vowels++
  break;   
  case"i": vowels++
  break;
  case"I": vowels++
  break;  
  case "o": vowels++
  break; 
  case"O": vowels++
  break;
  case "u":vowels++
  break;
  case"U": vowels++
  break;
  case"": 
  default: consonants++
  
  break;}*/
      
    }
  
  console.log(`${fruit} has ${vowels} vowels and ${consonants}consonants.` )
  
}
