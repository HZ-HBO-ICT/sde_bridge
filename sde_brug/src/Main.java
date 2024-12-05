import domain.BarGate;
import domain.Bridge;
import domain.RoadPart;

public class Main {
    public static void main(String[] args) {

        // domain
        BridgeBuilder builder = new BridgeBuilder();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addRoadPart();
        builder.addBridge();
        builder.addBarrier();

        BridgeProduct product = builder.getProduct();

        RoadPart part1 = product.get_roadpart();
        BridgeOperatorFacade brugwachter = product.get_facade();


        RoadPartConsoleDecorator part1console =
                new RoadPartConsoleDecorator(part1);



        brugwachter.open();
        System.out.println(part1console.showRoad());

        brugwachter.close();
        System.out.println(part1console.showRoad());
    }
}