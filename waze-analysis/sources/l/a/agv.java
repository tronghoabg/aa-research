package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agv implements com.google.v.eg {
    LOCATION_PERMISSION_REQUEST_TYPE_UNSPECIFIED(0),
    ASK_FOR_ALWAYS(1),
    PERMISSION_UPDATE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52474f;

    agv(int i2) {
        this.f52474f = i2;
    }

    public static agv a(int i2) {
        if (i2 == 0) {
            return LOCATION_PERMISSION_REQUEST_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ASK_FOR_ALWAYS;
        }
        if (i2 != 2) {
            return null;
        }
        return PERMISSION_UPDATE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52474f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52474f);
    }
}
