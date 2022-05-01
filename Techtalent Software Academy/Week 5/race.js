let raceNumber=Math.floor(Math.random()*1000);
  //race number randomiser
early=false;
  //register early
runnerAge=54;
  //runners age
if (runnerAge>18 && early==true){raceNumber=raceNumber+1000};
  //if runner is adult and registered early add 1000 to racenumber
if (runnerAge>18 && early==true){console.log (`You will race at 9.30AM and your race number is ${raceNumber}`)}
  //racetime for early adult runners
else if (runnerAge>18&& early==false){console.log(`You will race at 11:00AM, your race number is ${raceNumber}.`)}
  //racetime for late adult runners
else if (runnerAge<18){console.log(`you will race at 12:30PM, your race number is ${raceNumber}.`)}
  //racetime for children
else {console.log("please visit the registration desk")};
  //extra info so 18 year olds may register manuallt for preferred race