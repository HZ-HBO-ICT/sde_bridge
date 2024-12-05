import domain.RoadPart;

public class BridgeProduct {

    private BridgeOperatorFacade _facade;
    private RoadPart _roadpart;

    public BridgeOperatorFacade get_facade() {
        return _facade;
    }

    public RoadPart get_roadpart() {
        return _roadpart;
    }

    public BridgeProduct(BridgeOperatorFacade facade, RoadPart roadpart) {
        this._facade = facade;
        this._roadpart = roadpart;
    }
}
