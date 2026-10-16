package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum aq implements com.google.v.eg {
    UNKNOWN(0),
    TYPE1(1),
    TYPE2(2),
    CHADEMO(3),
    CCS_TYPE1(4),
    CCS_TYPE2(5),
    TESLA(6),
    GB_T(7),
    WALL_OUTLET(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f49372k;

    aq(int i2) {
        this.f49372k = i2;
    }

    public static aq a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return TYPE1;
            case 2:
                return TYPE2;
            case 3:
                return CHADEMO;
            case 4:
                return CCS_TYPE1;
            case 5:
                return CCS_TYPE2;
            case 6:
                return TESLA;
            case 7:
                return GB_T;
            case 8:
                return WALL_OUTLET;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49372k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49372k);
    }
}
