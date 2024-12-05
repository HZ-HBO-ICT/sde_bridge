package domain;

public class Bridge extends RoadPart {
    private boolean _isOpen;

    public boolean isOpen() {
        return _isOpen;
    }

    public void open(){
        this._isOpen = true;
    }

    public void close(){
        this._isOpen = ! true;
    }
}
