package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum of implements com.google.v.eg {
    IMPACT_TYPE_UNSPECIFIED(0),
    UNREACHABLE_DESTINATION_LONG(1),
    UNAVAILABLE_PREFERRED_ROUTE(2),
    UNAVAILABLE_NATURAL_ROUTE(3),
    LONGER_DRIVE_TIME(4),
    UNREACHABLE_DESTINATION_SHORT(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f48937h;

    of(int i2) {
        this.f48937h = i2;
    }

    public static of a(int i2) {
        if (i2 == 0) {
            return IMPACT_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return UNREACHABLE_DESTINATION_LONG;
        }
        if (i2 == 2) {
            return UNAVAILABLE_PREFERRED_ROUTE;
        }
        if (i2 == 3) {
            return UNAVAILABLE_NATURAL_ROUTE;
        }
        if (i2 == 4) {
            return LONGER_DRIVE_TIME;
        }
        if (i2 != 5) {
            return null;
        }
        return UNREACHABLE_DESTINATION_SHORT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48937h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48937h);
    }
}
