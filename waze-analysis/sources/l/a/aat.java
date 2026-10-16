package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aat implements com.google.v.eg {
    GPS_SOURCE_UNSPECIFIED(0),
    DEVICE(1),
    EXTERNAL_DEVICE(2),
    NONE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52115g;

    aat(int i2) {
        this.f52115g = i2;
    }

    public static aat a(int i2) {
        if (i2 == 0) {
            return GPS_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DEVICE;
        }
        if (i2 == 2) {
            return EXTERNAL_DEVICE;
        }
        if (i2 != 3) {
            return null;
        }
        return NONE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52115g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52115g);
    }
}
