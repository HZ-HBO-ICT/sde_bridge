package domain;

public class RoadPart implements IRoadPart {

    private RoadPart _next;

    public void setNext(RoadPart next) {
        this._next = next;
    }

    public RoadPart getNext() {
        return this._next;
    }
}
