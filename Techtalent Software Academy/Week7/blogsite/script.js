function mode(){


if (document.body.style.backgroundColor == "white") {
  document.body.style.backgroundColor = "black";
} else {
  document.body.style.backgroundColor = "white"
}

if(document.body.style.color=="black") {
  document.body.style.color="white";
} else {
  document.body.style.color="black"
}

let element=document.getElementById ('editor');
if(element.style.backgroundColor=="ghostwhite") {
  element.style.backgroundColor="#292929"
} else {
  element.style.backgroundColor="ghostwhite"
}
}

/*let element=document.getElementById('firstentry');
element.style.backgroundColor="darkgrey";

let entryTwo=document.getElementById('second');
entryTwo.style.backgroundColor="darkgrey";*/






function make_blog(){


  let title= document.getElementById('blogtitle').value;

  let author=document.getElementById('author').value;

  let content=document.getElementById('blog').value;

  let form=document.getElementById('blogger');


form.addEventListener('submit', (e)=>{
e.preventDefault()
})
let messages =[];
if (title||author||content) {



let titleEntry=document.createElement('h2');

 titleEntry.innertext= title;


 let titleAuthor=document.createElement('h5');

 titleAuthor.innertext=author;

 let titleContent=document.createElement('p');

 titleContent.innertext=content;

document.getElementById('new').append(titleEntry);
}
}

function analyse_form(){






window.open
}
