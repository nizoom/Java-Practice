package Intro;
public class JavaLessonSeven
{


    public final String TOMBSTONE = "Here Lies a Dead Monster";

    // as many private fields as possible

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int yPosition = 0;
    private int xPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    // these getter methods keep the private fields protected

    public int getAttack()
    {
        return attack;
    }

    public int getMovement(){
        return movement;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth (int decreaseHealth)
    {
        health =- decreaseHealth;

        if(health < 1)
        {
             alive = false;
        }
    }

    public void setHealth(double decrease) 
    {

        int intDecreaseHleath = (int) decrease;
        health =- intDecreaseHleath;

        if(health < 1)
        {
             alive = false; 
        }
    }

    // public Monster(int newHealth, int newAttack, int newMovement)
    // {
    //     this.health = newHealth;
    //     this.attack = newAttack;
    //     this.newMovement = newMovement; 

    // }


}