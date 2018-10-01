import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,243,147);
        Crab crab = new Crab();
        addObject(crab,301,381);
        Worm worm = new Worm();
        addObject(worm,369,90);
        Worm worm2 = new Worm();
        addObject(worm2,446,183);
        Worm worm3 = new Worm();
        addObject(worm3,506,320);
        Worm worm4 = new Worm();
        addObject(worm4,491,424);
        Worm worm5 = new Worm();
        addObject(worm5,375,492);
        Worm worm6 = new Worm();
        addObject(worm6,207,492);
        Worm worm7 = new Worm();
        addObject(worm7,101,369);
        Worm worm8 = new Worm();
        addObject(worm8,79,233);
        Worm worm9 = new Worm();
        addObject(worm9,124,79);
        Worm worm10 = new Worm();
        addObject(worm10,468,99);
    }
}
