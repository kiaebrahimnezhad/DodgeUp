import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//DIR SHROOE KARDAM TAMOM NASHOD!!!

public class Main extends PApplet {
    public static PApplet processing;
    static boolean IsCrashed = false;
    ArrayList<Block> blocks = new ArrayList<>();
    Random random = new Random();
    public static void main(String[] args)
    {
        PApplet.main("Main",args);
    }
    Human human = new Human();
    Block block1;
    Block block2;
    Block block3;
    Block block4;
    Block block5;
    Block block6;
    Block block7;
    Block block8;
    Block block9;
    Block block10;
    Block block11;
    Block block12;

    @Override
    public void setup() {
        processing = this;
        background(100, 179, 172);
        newingBlocks();
        blocks.add(block1);
        blocks.add(block2);
        blocks.add(block3);
        blocks.add(block4);
        blocks.add(block5);
        blocks.add(block6);
        blocks.add(block7);
        blocks.add(block8);
        blocks.add(block9);
        blocks.add(block10);
        blocks.add(block11);
        blocks.add(block12);
    }

    @Override
    public void settings() {
        size(400,700);
    }

    @Override
    public void draw() {
        background(100, 179, 172);
        human.showObject();
        for (Block block : blocks)
        {
            block.showObject();
        }
        CheckingCrash();
        if (IsCrashed == true)
        {
            System.exit(-1);
        }
    }
    public void CheckingCrash()
    {
        for (Block block : blocks)
        {
            if(block.getX() ==  mouseX)
            {
                if (block.getY() == mouseY)
                {
                    IsCrashed = true;
                }
            } else
            {
                IsCrashed = false;
            }
        }
    }
    public void newingBlocks()
    {
        block1 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block2 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block3 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block4 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block5 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block6 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block7 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block8 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block9 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block10 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block11 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);
        block12 = new Block(random.nextInt(250),random.nextInt(250),random.nextInt(250),random.nextInt(10,390),random.nextInt(-300,0),2);


    }
}