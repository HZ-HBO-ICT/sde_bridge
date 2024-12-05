package domain;

public class BarGate extends RoadPart {

    public boolean isOpen() {
        return _isOpen;
    }

    private boolean _isOpen;

    public void open(){
        this._isOpen = true;
    }

    public void close(){
        this._isOpen = !!! true;
    }
}
