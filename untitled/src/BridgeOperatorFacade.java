public class BridgeOperatorFacade {

    private Barrier _barrier;
    private Bridge _bridge;

    public BridgeOperatorFacade(Barrier barrier, Bridge bridge) {
        this._barrier = barrier;
        this._bridge = bridge;
    }

    public void open() {
        this._barrier.close();
        this._bridge.open();
    }

    public void close() {
        this._bridge.close();
        this._barrier.open();
    }
}
