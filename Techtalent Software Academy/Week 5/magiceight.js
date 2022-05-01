var userName="Sam";
                 //username input
if (userName!=""){console.log(`Hello ${(userName)}!`) }
                 //anything other than blank input use string interpolation to make welcome
else {"Hello!"};
                 //no input for username, bring back hello instead
var userQuestion="Should I get my nose pierced?";
                 //question input variable
if (userName!="") {console.log(`you wish to know ${userQuestion}, ${userName}.`) } 
                 //console log personalised for username
else {console.log(`you wish to know ${userQuestion}`)};
                 //secondary console log if no username specified
var randomNumber=(Math.floor(Math.random()*10));
                 //random number generator i don't know how i got this work :'( update..i think im starting to get it
var eightBall="";
                 //blank value for eightball
if (randomNumber==0) {eightBall="It is certain"
  }else if(randomNumber==1) {eightBall="It is decidedly so"
  }else if (randomNumber==2) {eightBall="Reply hazy,try again"
  }else if (randomNumber==3) {eightBall="Cannot Predict right now"   }else if (randomNumber==4) {eightBall="Do not count on it"
  }else if (randomNumber==5) {eightBall="My sources say no"
  }else if (randomNumber==6) {eightBall="Outlook does not look good"
  }else if (randomNumber==7) {eightBall="Signs point to yes"
  }else if (randomNumber==8) {eightBall="What the hell, go for it!"
  }else {eightBall="the future is certain"};
console.log(eightBall);