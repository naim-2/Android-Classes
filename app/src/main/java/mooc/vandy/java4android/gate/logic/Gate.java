package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;
    public Gate(){
        mSwing = CLOSED;
    }
    public boolean setSwing(int direction){
        if(direction == IN || direction == OUT || direction == CLOSED){
            this.mSwing = direction;
            return true;
        }
        return false;
    }
    public boolean open(int direction){
        if(direction == IN || direction == OUT){
            this.mSwing = direction;
            return true;
        }
        return false;
    }
    public void close(){
        this.mSwing = CLOSED;
    }
    public int getSwingDirection(){
        return mSwing;
    }
    public int thru(int count){
        return mSwing * count;
    }
    @Override
    public String toString(){
        if(mSwing == CLOSED){
            return "This gate is closed";
        }
        else if(mSwing == IN){
            return "This gate is open and swings to enter the pen only";
        }
        else if(mSwing == OUT){
            return "This gate is open and swings to exit the pen only";
        }
        else {
            return "This gate has an invalid swing direction";
        }
    }
}