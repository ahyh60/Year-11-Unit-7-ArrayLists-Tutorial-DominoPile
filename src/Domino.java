public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }

    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }

    public String toString(){
        return(top+"/"+bottom);
    }
    public void flip(){
        int p = top;
        top = bottom;
        bottom = p;
    }
    public void settle(){
        if(top>bottom){
            flip();
        }
    }
    public int compareTo(Domino other){
        int smallerDomino;
        int higherDomino;
        int lowOtherDom;
        int highOtherDom;
        if (top<bottom){
            smallerDomino = top;
            higherDomino = bottom;
        }
        else {
            smallerDomino = bottom;
            higherDomino = top;
        }
        if (other.top<other.bottom){
            lowOtherDom = other.top;
            highOtherDom = other.bottom;
        }
        else {
            lowOtherDom = other.bottom;
            highOtherDom = other.top;
        }

        if (smallerDomino < lowOtherDom){
            return -1;
        }
        else if (smallerDomino > lowOtherDom){
            return 1;
        }
        else {
            if (higherDomino < highOtherDom){
                return -1;
            }
            else if (higherDomino > highOtherDom){
                return 1;
            }
            else {
                return 0;
            }
        }

    }
    public int compareToWeight(Domino other){
        int thisTotal = top + bottom;
        int otherTotal = other.top + other.bottom;
        if (thisTotal<otherTotal){
            return -1;
        }
        else if (thisTotal>otherTotal){
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        if(this.top==other.top||this.top==other.bottom||this.bottom==other.bottom||this.bottom==other.top){
            return true;
        }
        else return false;
    }
}