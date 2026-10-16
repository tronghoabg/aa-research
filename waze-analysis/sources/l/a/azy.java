package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum azy implements com.google.v.eg {
    SEARCH_TYPE_UNSPECIFIED(0),
    CATEGORY_SEARCH(1),
    LINE_SEARCH(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53528f;

    azy(int i2) {
        this.f53528f = i2;
    }

    public static azy a(int i2) {
        if (i2 == 0) {
            return SEARCH_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CATEGORY_SEARCH;
        }
        if (i2 != 2) {
            return null;
        }
        return LINE_SEARCH;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53528f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53528f);
    }
}
