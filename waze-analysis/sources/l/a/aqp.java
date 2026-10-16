package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aqp implements com.google.v.eg {
    PIN_TYPE_UNSPECIFIED(0),
    PIN_TYPE_CURRENT_LOCATION(1),
    PIN_TYPE_HOME(2),
    PIN_TYPE_WORK(3),
    PIN_TYPE_WAZER(4),
    PIN_TYPE_YOUR_PARKING(5),
    PIN_TYPE_PARKING(6),
    PIN_TYPE_VENUE(7),
    PIN_TYPE_DROPPED_PIN(8),
    PIN_TYPE_SEARCH_RESULT(9),
    PIN_TYPE_SHOW_ON_MAP(10),
    PIN_TYPE_SET_START_POINT(11),
    PIN_TYPE_ORIGINAL_DESTINATION(12),
    PIN_TYPE_OTHER(13),
    UNRECOGNIZED(-1);

    private final int q;

    aqp(int i2) {
        this.q = i2;
    }

    public static aqp a(int i2) {
        switch (i2) {
            case 0:
                return PIN_TYPE_UNSPECIFIED;
            case 1:
                return PIN_TYPE_CURRENT_LOCATION;
            case 2:
                return PIN_TYPE_HOME;
            case 3:
                return PIN_TYPE_WORK;
            case 4:
                return PIN_TYPE_WAZER;
            case 5:
                return PIN_TYPE_YOUR_PARKING;
            case 6:
                return PIN_TYPE_PARKING;
            case 7:
                return PIN_TYPE_VENUE;
            case 8:
                return PIN_TYPE_DROPPED_PIN;
            case 9:
                return PIN_TYPE_SEARCH_RESULT;
            case 10:
                return PIN_TYPE_SHOW_ON_MAP;
            case 11:
                return PIN_TYPE_SET_START_POINT;
            case 12:
                return PIN_TYPE_ORIGINAL_DESTINATION;
            case 13:
                return PIN_TYPE_OTHER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
