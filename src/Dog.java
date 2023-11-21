public class Dog implements Devilish, Animal{
    @Override
    public String misbehave(String obj){
        return "I chewed your " + obj;
    }
    @Override
    public String move(){
        return "I'm run";
    }
    @Override
    public String makeSound(){
        return "I bark!!!!";
    }
}
