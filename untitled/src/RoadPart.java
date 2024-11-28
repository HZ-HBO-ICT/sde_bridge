public class RoadPart {

    private String _symbol = "_";

    private RoadPart _next;

    public void set_next(RoadPart next) {
        this._next = next;
    }

    public RoadPart get_next() {
        return this._next;
    }

    protected String getSymbol(){
        return this._symbol;
    }

    public String showRoad() {

        if(this._next == null) {
             return getSymbol();
        } else {
            return getSymbol() + this._next.showRoad();
        }
    }
}
