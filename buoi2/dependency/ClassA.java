package buoi2.dependency;

public class ClassA {
      // field, attibute
      
    
      // function, methods
     ClassA(ClassB bRemote){

     }

     ClassA(){

     }
     public void setBRemote(ClassB bRemote){
        bRemote.methdB();
        
     }

     public void methodA(){
        ClassB bRemote = new ClassB();
        bRemote.methdB();;
     }
}
