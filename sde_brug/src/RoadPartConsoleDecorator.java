import domain.BarGate;
import domain.Bridge;
import domain.IRoadPart;

public class RoadPartConsoleDecorator extends BaseConsoleDecorator {

    private final String _symbol = "_";

    public RoadPartConsoleDecorator(IRoadPart roadPart) {
        super(roadPart);
    }

    @Override
    public String getSymbol() {

        return this._symbol;
    }
}
