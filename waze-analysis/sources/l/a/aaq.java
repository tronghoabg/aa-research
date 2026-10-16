package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aaq implements com.google.v.eg {
    RECEPTION_QUALITY_UNSPECIFIED(0),
    GOOD(1),
    POOR(2),
    UNAVAILABLE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52108g;

    aaq(int i2) {
        this.f52108g = i2;
    }

    public static aaq a(int i2) {
        if (i2 == 0) {
            return RECEPTION_QUALITY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GOOD;
        }
        if (i2 == 2) {
            return POOR;
        }
        if (i2 != 3) {
            return null;
        }
        return UNAVAILABLE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52108g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52108g);
    }
}
