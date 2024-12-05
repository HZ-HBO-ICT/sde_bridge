import domain.BarGate;
import domain.Bridge;
import domain.RoadPart;

public class BridgeBuilder {

    private RoadPart _firstRoadpart;
    private RoadPart _currentRoadpart;

    private Bridge _bridge;
    private BarGate _barrier;

    public BridgeBuilder() {
        this._firstRoadpart = new RoadPart();
        this._currentRoadpart = this._firstRoadpart;
    }

    public void addRoadPart() {
        RoadPart part = new RoadPart();
        this._currentRoadpart.setNext(part);

        this._currentRoadpart = part;
    }

    public void addBridge() {
        Bridge part = new Bridge();
        this._bridge = part;
        this._currentRoadpart.setNext(part);

        this._currentRoadpart = part;
    }

    public void addBarrier() {
        BarGate part = new BarGate();
        this._barrier = part;
        this._currentRoadpart.setNext(part);

        this._currentRoadpart = part;
    }

    public BridgeProduct getProduct() {

        BridgeOperatorFacade brugwachter =
                new BridgeOperatorFacade(this._bridge, this._barrier, this._barrier);

        BridgeProduct product =
                new BridgeProduct(brugwachter, this._firstRoadpart);

        return product;
    }
}
