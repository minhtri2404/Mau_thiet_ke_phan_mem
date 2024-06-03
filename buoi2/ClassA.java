package buoi2;

public class ClassA {
    // field, attibute
    private ClassB bRemote; // instance filed / variable
    
    // function, methods
    ClassA(ClassB bRemote){ //bRemote: local variable
        this.bRemote = bRemote;
        
    }
    
    ClassA(){

    }
    public void setBRrmote(ClassB bRemote) {
        this.bRemote = bRemote;
    }


    public void methodA(){
        bRemote.methdB(); //message: gui thong diep
    }
    
}
