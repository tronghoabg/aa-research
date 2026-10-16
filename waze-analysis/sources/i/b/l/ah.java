package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ah implements com.google.v.eg {
    ROUTE_AND_ETA(1),
    ETA_ONLY(2),
    ETA_AND_LOCATION(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f48574e;

    ah(int i2) {
        this.f48574e = i2;
    }

    public static ah a(int i2) {
        if (i2 == 1) {
            return ROUTE_AND_ETA;
        }
        if (i2 == 2) {
            return ETA_ONLY;
        }
        if (i2 != 3) {
            return null;
        }
        return ETA_AND_LOCATION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48574e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48574e);
    }
}
