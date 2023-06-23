public class Block implements Interface
{
    public int Hight = 40;
    public int Width = 30;
    private int x;
    private int y;
    private int speedY;
    private int ColorR;
    private int ColorG;
    private int ColorB;

    public void showObject()
    {
        Main.processing.fill(ColorR , ColorG , ColorB);
        Main.processing.rect(x , y , Width , Hight);
        y = y+speedY;
    }

    public Block(int colorR, int colorG, int colorB, int x, int y, int speedY) {
        ColorR = colorR;
        ColorG = colorG;
        ColorB = colorB;
        this.x = x;
        this.y = y;
        this.speedY = speedY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getColorR() {
        return ColorR;
    }

    public void setColorR(int colorR) {
        ColorR = colorR;
    }

    public int getColorG() {
        return ColorG;
    }

    public void setColorG(int colorG) {
        ColorG = colorG;
    }

    public int getColorB() {
        return ColorB;
    }

    public void setColorB(int colorB) {
        ColorB = colorB;
    }

    public int getHight() {
        return Hight;
    }

    public int getWidth() {
        return Width;
    }
    public void addBlocks()//add blocks to array list
    {

    }
}
