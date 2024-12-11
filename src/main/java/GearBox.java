public class GearBox {
    public final static int REAR = -1;

    public final static int NEUTRAL = 0;

    public final static int MIN_GEAR = 1;

    public final static int MAX_GEAR = 6;

    private int currentGear = NEUTRAL;

    private GearBoxType gearBoxType;

    public GearBox(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public int shiftUP(){
        return currentGear < MAX_GEAR ? currentGear++ : currentGear;
    }

    public int shiftDown() {
        return currentGear >= MIN_GEAR ? currentGear-- : currentGear;
    }
    public int shiftRear() {
        return currentGear > MIN_GEAR ? currentGear : REAR;
    }
}
