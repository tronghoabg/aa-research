package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aor implements com.google.v.eg {
    ORIGIN_TYPE_UNSPECIFIED(0),
    CURRENT_LOCATION(1),
    PLACE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52890f;

    aor(int i2) {
        this.f52890f = i2;
    }

    public static aor a(int i2) {
        if (i2 == 0) {
            return ORIGIN_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CURRENT_LOCATION;
        }
        if (i2 != 2) {
            return null;
        }
        return PLACE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52890f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52890f);
    }
}
