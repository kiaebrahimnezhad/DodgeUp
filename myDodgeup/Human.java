public class Human implements Interface
{
    public int Hight = 30;
    public int Width = 30;
    public int Radius = 30;
    public void showObject()
    {
        Main.processing.fill(214 , 95 , 26);//Chose From ((rgb color picker))
        Main.processing.noStroke();
        Main.processing.circle(Main.processing.mouseX + 15 ,600 - 15 , Radius);
        Main.processing.fill(100 , 100 , 56);
        Main.processing.rect(Main.processing.mouseX , 600 , Width , Hight);
    }

    public int getHight() {
        return Hight;
    }

    public int getWidth() {
        return Width;
    }


    public void setHight(int hight) {
        Hight = hight;
    }

    public void setWidth(int width) {
        Width = width;
    }


}
