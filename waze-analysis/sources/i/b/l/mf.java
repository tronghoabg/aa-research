package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum mf implements com.google.v.eg {
    UNSPECIFIED_NEGATIVE_FACTOR(0),
    TOLL(1),
    FERRY(2),
    UNPAVED(3),
    DIFFICULT_TURN(4),
    INTERNATIONAL(5),
    RESTRICTED_ZONE(6),
    DANGER_ZONE(7),
    LENGTH(8),
    PRICE(9),
    UNSAFE(10);

    private final int m;

    mf(int i2) {
        this.m = i2;
    }

    public static mf a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED_NEGATIVE_FACTOR;
            case 1:
                return TOLL;
            case 2:
                return FERRY;
            case 3:
                return UNPAVED;
            case 4:
                return DIFFICULT_TURN;
            case 5:
                return INTERNATIONAL;
            case 6:
                return RESTRICTED_ZONE;
            case 7:
                return DANGER_ZONE;
            case 8:
                return LENGTH;
            case 9:
                return PRICE;
            case 10:
                return UNSAFE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
