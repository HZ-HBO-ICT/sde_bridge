import domain.BarGate;
import domain.Bridge;
import domain.IRoadPart;
import domain.RoadPart;

public abstract class BaseConsoleDecorator implements IRoadPart {

    private IRoadPart _roadPart;

    public BaseConsoleDecorator(IRoadPart roadPart) {

        this._roadPart = roadPart;
    }
    @Override
    public void setNext(RoadPart next) {

        this._roadPart.setNext(next);
    }

    @Override
    public RoadPart getNext() {
        return this._roadPart.getNext();
    }

    public abstract String getSymbol();

    public String showRoad() {

        BaseConsoleDecorator consoleDecorator = getWrapped(this._roadPart);

        if(this.getNext() == null) {
            return consoleDecorator.getSymbol();
        } else {
            BaseConsoleDecorator nextConsole =
                    getWrapped(this.getNext());
            return consoleDecorator.getSymbol() + nextConsole.showRoad();
        }
    }

    private BaseConsoleDecorator getWrapped(IRoadPart roadPart) {
        boolean isBridge = roadPart instanceof Bridge;
        boolean isBarGate = roadPart instanceof BarGate;

        if(isBridge) return new BridgeConsoleDecorator((Bridge) roadPart);
        if(isBarGate) return new BarGateConsoleDecorator((BarGate) roadPart);

        return new RoadPartConsoleDecorator(roadPart);
    }
}
