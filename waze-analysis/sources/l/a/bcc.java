package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bcc implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CLOSE(1),
    MORE_OPTIONS(2),
    SHARE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53726g;

    bcc(int i2) {
        this.f53726g = i2;
    }

    public static bcc a(int i2) {
        if (i2 == 0) {
            return ACTION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CLOSE;
        }
        if (i2 == 2) {
            return MORE_OPTIONS;
        }
        if (i2 != 3) {
            return null;
        }
        return SHARE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53726g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53726g);
    }
}
