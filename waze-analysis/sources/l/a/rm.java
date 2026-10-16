package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rm implements com.google.v.eg {
    DESTINATION_TYPE_UNSPECIFIED(0),
    DESTINATION_TYPE_FINAL(1),
    DESTINATION_TYPE_WAYPOINT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55370f;

    rm(int i2) {
        this.f55370f = i2;
    }

    public static rm a(int i2) {
        if (i2 == 0) {
            return DESTINATION_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DESTINATION_TYPE_FINAL;
        }
        if (i2 != 2) {
            return null;
        }
        return DESTINATION_TYPE_WAYPOINT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55370f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55370f);
    }
}
