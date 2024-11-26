interface animal
{
    public void sound();
    public void eat();

}
class dog implements animal
{
    public void sound()
    {
        System.out.println("Woof");
    }
    public void eat()
    {
        System.out.println("bones");
    }
}
class cat implements animal
{
    public void sound()
    {
        System.out.println("Meow");
    }
    public void eat()
    {
        System.out.println("Cat food");
    }
}
class Main
{
    public static void main(String[]args)
    {
        animal obj= new dog();
        animal obj1= new cat(); 
        
        obj.sound();
        obj.eat();
        obj1.sound();
        obj1.eat();
    }
}