package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ic implements com.google.v.eg {
    RECEPTION_QUALITY_UNSPECIFIED(0),
    GOOD(1),
    POOR(2),
    UNAVAILABLE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54961g;

    ic(int i2) {
        this.f54961g = i2;
    }

    public static ic a(int i2) {
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
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54961g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54961g);
    }
}
