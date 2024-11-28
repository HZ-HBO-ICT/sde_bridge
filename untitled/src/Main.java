public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        RoadPart part1 = new RoadPart();
        Barrier part2 = new Barrier();
        Bridge part3 = new Bridge();
        RoadPart part4 = new RoadPart();
        RoadPart part5 = new RoadPart();

        part1.set_next(part2);
        part2.set_next(part3);
        part3.set_next(part4);
        part4.set_next(part5);

        BridgeOperatorFacade bridgeOperator
                = new BridgeOperatorFacade(part2, part3);

        bridgeOperator.open();
        String road = part1.showRoad();
        System.out.println(road);

        bridgeOperator.close();
        road = part1.showRoad();
        System.out.println(road);
    }
}