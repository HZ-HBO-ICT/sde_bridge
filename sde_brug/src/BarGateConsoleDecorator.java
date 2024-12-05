import domain.BarGate;
import domain.Bridge;

public class BarGateConsoleDecorator extends BaseConsoleDecorator {

    private BarGate _barGate;
    public BarGateConsoleDecorator(BarGate roadPart) {

        super(roadPart);
        this._barGate = roadPart;
    }

    private String _symbolOpen = "_";
    private String _symbolClosed = "=";

    @Override
    public String getSymbol() {
        if(this._barGate.isOpen()) {
            return this._symbolOpen;
        }
        return this._symbolClosed;
    }
}
