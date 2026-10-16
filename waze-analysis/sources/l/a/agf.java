package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agf implements com.google.v.eg {
    CLICK_OPTION_UNSPECIFIED(0),
    CLOSE(1),
    SHOW_UPDATES(2),
    HIDE_UPDATES(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52443g;

    agf(int i2) {
        this.f52443g = i2;
    }

    public static agf a(int i2) {
        if (i2 == 0) {
            return CLICK_OPTION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CLOSE;
        }
        if (i2 == 2) {
            return SHOW_UPDATES;
        }
        if (i2 != 3) {
            return null;
        }
        return HIDE_UPDATES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52443g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52443g);
    }
}
