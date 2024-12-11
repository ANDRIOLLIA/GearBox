public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox(GearBoxType.VARIATOR);
        System.out.println(gearBox.shiftUP());
        System.out.println(gearBox.shiftUP());
        System.out.println(gearBox.shiftUP());
        System.out.println(gearBox.shiftUP());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftDown());
        System.out.println(gearBox.shiftDown());
    }
}
