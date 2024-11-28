public class Barrier extends RoadPart {

    private boolean _isOpen;

    private String _symbolOpen = "_";
    private String _symbolClosed = "=";

    @Override
    protected String getSymbol() {

        if(this._isOpen) {
            return this._symbolOpen;
        } else {
            return this._symbolClosed;
        }
    }

    public void close() {
        this._isOpen = false;
    }

    public void open() {
        this._isOpen = true;
    }
}
