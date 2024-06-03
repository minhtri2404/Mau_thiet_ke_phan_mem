package buoi2.composition;

public class ClassA {
     // field, attibute
     private ClassB bRemote; // instance filed / variable
    
     // function, methods
     ClassA(){
        bRemote = new ClassB();
     }
 
 
     public void methodA(){
         bRemote.methdB(); //message: gui thong diep
     }
}
