package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azs implements com.google.v.eg {
    SEARCH_SOURCE_UNSPECIFIED(0),
    TEXT(1),
    ICON(2),
    AUTOCOMPLETE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f53510g;

    azs(int i2) {
        this.f53510g = i2;
    }

    public static azs a(int i2) {
        if (i2 == 0) {
            return SEARCH_SOURCE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TEXT;
        }
        if (i2 == 2) {
            return ICON;
        }
        if (i2 != 3) {
            return null;
        }
        return AUTOCOMPLETE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53510g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53510g);
    }
}
