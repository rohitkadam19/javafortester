package com.javafortester.chapter.first;

 import org.junit.Test;

 public class JavaExampleCode {

	 public void aMethodOnAClass(){
		  System.out.println("Hello World");
		}
	 
 @Test
 public void canOutputHelloWorldToConsole(){
	 JavaExampleCode myClass = new JavaExampleCode();
 myClass.aMethodOnAClass();
 }
 }
