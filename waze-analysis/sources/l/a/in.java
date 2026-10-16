package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum in implements com.google.v.eg {
    BLUTOOTH_ACCESS_REQUEST_TRIGGER_UNSPECIFIED(0),
    BEACONS(1),
    TIDE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54975f;

    in(int i2) {
        this.f54975f = i2;
    }

    public static in a(int i2) {
        if (i2 == 0) {
            return BLUTOOTH_ACCESS_REQUEST_TRIGGER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BEACONS;
        }
        if (i2 != 2) {
            return null;
        }
        return TIDE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54975f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54975f);
    }
}
