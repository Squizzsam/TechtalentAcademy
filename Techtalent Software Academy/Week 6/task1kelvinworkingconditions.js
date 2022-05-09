let temperature= prompt ("What is the temperature in Celsius?");
//temperature variable
let condition= prompt ("What is the condition? Sunny, Cloudy, Raining, Snowing or Thunder.");
//condition variable, i cant get this to stop asking for it more than once :'(' omg..it was seriously because my browser was small and not enough room for the question
condition=condition.toLowerCase();
//incase of capital use by user
let goToWork;
//got to work variable
if (temperature>30){
  //original sequence would not work, i rearranged code to check for larger temperatures first.
    switch(condition){
      case "sunny": goToWork=false
        console.log("It's to hot to work effectively")
      break;
        //implemented switches to assign true or false to goToWork
      case "cloudy": goToWork=false
        console.log("It's to hot to work effectively")
      break;
      case "raining": goToWork=false
        console.log ("It's to hot to work effectively")
      break;
      case "snowing": goToWork=false
        console.log("As the weather is too weird")
      break;
      case "thunder":goToWork=false
        console.log("It's to hot to work effectively")
      break;
      default:console.log("no known condition")   
    }
  
  } else if (temperature>20){//each else if has it's own switch in it's implementable code.
      switch(condition){
        case "sunny": goToWork=true
        break;
        case "cloudy": goToWork=true
        break;
        case "raining": goToWork=true
          console.log ("As being warm and wet is not the worst")
        break;
        case "snowing": goToWork=false
          console.log("As the weather is too weird")
        break;
        case "thunder":goToWork=false
          console.log("As Kelvin is working with metal.")
        break;
        default:console.log("no known condition") }
  } 
        else if (temperature >= 10){
        switch(condition){
          case "sunny": goToWork= true
          break;
          case "cloudy": goToWork=true
          break;
          case "raining":goToWork=false
          console.log ("As no one likes being wet and cold ")
          break;
          case "snowing": goToWork=false
          break;
          case "thunder":goToWork=false
            console.log("As Kelvin is working with metal.")
          break;
          default:console.log("no known condition")
        }
      }

    else if (temperature<10){
        switch(condition){
          case "sunny": goToWork=false
            console.log("It's too cold to work effectively")
          break;
          case "cloudy": goToWork=false
            console.log("It's too cold to work effectively")
          break;
          case "raining": goToWork=false
            console.log ("It's too cold to work effectively")
          break;
          case "snowing": goToWork=false
            console.log("It's too cold to work effectively")
          break;
          case "thunder":goToWork=false
            console.log("It's too cold to work effectively")
          break;
          default:console.log("no known condition")   
        }
      }
if(goToWork) 
{ console.log("Go to Work")}
else{console.log ("Don't go to work")}
