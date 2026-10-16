package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum cv implements com.google.v.eg {
    PUBLIC_AIRPORT_ONLY(0),
    PUBLIC_RESERVATION_ONLY(1),
    PUBLIC_EVENT_ONLY(2),
    PUBLIC_VALET_ONLY(3),
    PUBLIC_PERMIT_ONLY(4),
    PUBLIC_MONTHLY_ONLY(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f49464h;

    cv(int i2) {
        this.f49464h = i2;
    }

    public static cv a(int i2) {
        if (i2 == 0) {
            return PUBLIC_AIRPORT_ONLY;
        }
        if (i2 == 1) {
            return PUBLIC_RESERVATION_ONLY;
        }
        if (i2 == 2) {
            return PUBLIC_EVENT_ONLY;
        }
        if (i2 == 3) {
            return PUBLIC_VALET_ONLY;
        }
        if (i2 == 4) {
            return PUBLIC_PERMIT_ONLY;
        }
        if (i2 != 5) {
            return null;
        }
        return PUBLIC_MONTHLY_ONLY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49464h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49464h);
    }
}
