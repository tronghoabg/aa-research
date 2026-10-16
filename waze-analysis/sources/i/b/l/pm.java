package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum pm implements com.google.v.eg {
    NO_ROUTE_TYPE(0),
    HISTORIC_TIME(3),
    WALKING(4),
    DISTANCE(1),
    TIME(2),
    FAST(5),
    PARKING(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f48998i;

    pm(int i2) {
        this.f48998i = i2;
    }

    public static pm a(int i2) {
        switch (i2) {
            case 0:
                return NO_ROUTE_TYPE;
            case 1:
                return DISTANCE;
            case 2:
                return TIME;
            case 3:
                return HISTORIC_TIME;
            case 4:
                return WALKING;
            case 5:
                return FAST;
            case 6:
                return PARKING;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48998i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48998i);
    }
}
