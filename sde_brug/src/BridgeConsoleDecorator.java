import domain.Bridge;
import domain.IRoadPart;

public class BridgeConsoleDecorator extends BaseConsoleDecorator {

    private Bridge _bridge;
    public BridgeConsoleDecorator(Bridge roadPart) {

        super(roadPart);
        this._bridge = roadPart;
    }

    private String _symbolOpen = "|";
    private String _symbolClosed = "_";

    @Override
    public String getSymbol() {
        if(this._bridge.isOpen()) {
            return this._symbolOpen;
        }
        return this._symbolClosed;
    }
}
