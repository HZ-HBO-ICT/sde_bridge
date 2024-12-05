import domain.BarGate;
import domain.Bridge;

public class BridgeOperatorFacade {

    private Bridge _bridge;
    private BarGate _barGate1;
    private BarGate _barGate2;

    public BridgeOperatorFacade(Bridge bridge, BarGate barGate1, BarGate barGate2) {
        this._bridge = bridge;
        this._barGate1 = barGate1;
        this._barGate2 = barGate2;
    }

    public void open(){
        this._barGate1.close();
        this._barGate2.close();
        this._bridge.open();
    }

    public void close(){
        this._bridge.close();
        this._barGate1.open();
        this._barGate2.open();

    }
}
