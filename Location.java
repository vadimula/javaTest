public class Location {
    double maxNum;
    int xPos, yPos;
    double[][] arrow;
    public Location(double[][] arr) {
        this.arrow = arr;
        this.maxNum = Double.MIN_VALUE;
        this.xPos = 0;
        this.yPos = 0;
    }
    public double getMaxNum() {
        int lenX = arrow.length;
        int lenY = arrow.length;
        for (int i = 0; i < lenX; i++) {
            for (int j = 0; j < lenY; j++) {
                if (arrow[i][j] > maxNum) {
                    maxNum = arrow[i][j];
                    xPos = i;
                    yPos = j;
                }
            }
        }
        return maxNum;
    }
    public int getxPos() {
        return xPos;
    }
    public int getyPos () {
        return yPos;
    }
}