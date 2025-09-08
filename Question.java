public class Question {

    public class firstInheritClass{
        public void show(){
            System.out.println("First Inherit Class");
        }
    }
    public class toSecondInheritClass extends firstInheritClass{
        public void show(){
            System.out.println("Second Inherit Class");
        }
    }
    public class toThirdInheritClass extends toSecondInheritClass{
        public void show(){
            System.out.println("Third Inherit Class");
        }
    }
    
}
