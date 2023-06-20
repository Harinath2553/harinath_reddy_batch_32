import { Component, OnInit } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {

  constructor() { }
  var1: String="login";
  name=' ';
  name1=" ";
  name2=" ";
  name3=" ";
  name4=" ";
  c=1;
  
  
 oncli(){
this.name=" ";
this.name1=" ";
this.name2=" ";
this.name3=" ";
this.name4=" ";
 if(this.c==1){
  this.var1="logout";
  this.c=0;
 }
 else{
  this.var1="login";
  this.c=1;
 }

 }
  ngOnInit(): void {
  }

}
