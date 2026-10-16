package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum lu implements com.google.v.eg {
    IMPACT_INTERACTION_UNSPECIFIED(0),
    DESTINATION_IN_AREA(1),
    ORIGIN_IN_AREA(2),
    CROSSES_AREA(3),
    AVOIDS_AREA(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f48851g;

    lu(int i2) {
        this.f48851g = i2;
    }

    public static lu a(int i2) {
        if (i2 == 0) {
            return IMPACT_INTERACTION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DESTINATION_IN_AREA;
        }
        if (i2 == 2) {
            return ORIGIN_IN_AREA;
        }
        if (i2 == 3) {
            return CROSSES_AREA;
        }
        if (i2 != 4) {
            return null;
        }
        return AVOIDS_AREA;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48851g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48851g);
    }
}
