package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adl implements com.google.v.eg {
    AVAILABLE_CLICK_OPTIONS_UNSPECIFIED(0),
    PRIMARY(1),
    SECONDARY(2),
    CLOSE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52274g;

    adl(int i2) {
        this.f52274g = i2;
    }

    public static adl a(int i2) {
        if (i2 == 0) {
            return AVAILABLE_CLICK_OPTIONS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PRIMARY;
        }
        if (i2 == 2) {
            return SECONDARY;
        }
        if (i2 != 3) {
            return null;
        }
        return CLOSE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52274g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52274g);
    }
}
