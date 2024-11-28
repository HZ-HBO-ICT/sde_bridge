public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        RoadPart part1 = new RoadPart();
        RoadPart part2 = new RoadPart();
        RoadPart part3 = new RoadPart();
        RoadPart part4 = new RoadPart();
        RoadPart part5 = new RoadPart();

        part1.set_next(part2);
        part2.set_next(part3);
        part3.set_next(part4);
        part4.set_next(part5);

        String road = part1.showRoad();

        System.out.println(road);
    }
}