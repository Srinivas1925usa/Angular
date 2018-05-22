import { Component, OnInit } from '@angular/core';

@Component({
  selector:  '[app-test]',
/* 1 template: `<div>
            test works Srinivas
        </div>`,
  styles: [`
div  {
    color: red;
  }
    `]*/

  /*2 template:`<h2>
    welcome to {{name}}
</h2>
<h2> {{name.length}}</h2>
<h2> {{greetings()}}</h2>
<h2> {{siteUrl}}</h2>
<input type = "text" value="Srinivas Bollam"/> 
<input  bind-disabled ="isDisabled" id="myID" type = "text" value="Srinivas Bollam"/> 
`,*/

   /* 3 template: `<h2 [ngClass] ="messageClasses"> {{name}} </h2>`,

  styles: [`
  .text-success {
    color: green;
  }
  .text-danger {
   color: red;
  }
  .text-special{
  font-style: italic;
  }
`]*/
  
 //4 template: `<h2 [ngStyle] = "titleStyle"> {{name}}</h2>`,
  
 /*5 template: `<button (click)="onGreet()">Greet</button>
{{greeting}}`,*/
  
 /*6 template: `<input #myInput type = "text"/>
  <button (click) = "logMessage(myInput.value)">log</button>`,*/
  
  template:`<input [(ngModel)]="name" type="text"/>
{{name}}`,
  styles:[]

})
export class TestComponent implements OnInit {
 
  constructor() { } 
  
  public name="";
/*
  public name = "Srinivas ngStyle";
 public isDisabled = false;
  public myID = "testID"; 

  public hasError = false;

  public isSpecial = true;
  
  public greeting ="";

  public messageClasses = {

    "text-success": !this.hasError,

    "text-danger": this.hasError,

    "text-special": this.isSpecial

  }
  
  public titleStyle = {
    
   color: "red",
    fontStyle: "italic"
    
  }
  
  onGreet(){
    
   this.greeting = "welcome to Srinivas" 
    
  }
  
  logMessage(value){
    
    console.log(value)
  }
  public siteUrl = window.location.pathname;
 
  greetings() {
        return  "Hello " + this.name;
  }
  */
  ngOnInit() {
  }
}
