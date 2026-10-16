package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bz implements com.google.v.eg {
    AGE_SCREEN_TYPE_UNSPECIFIED(0),
    AGE_SCREEN_TYPE_OS_DATE_PICKER(1),
    AGE_SCREEN_TYPE_CUSTOMIZED_TEXT_FIELDS(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54685f;

    bz(int i2) {
        this.f54685f = i2;
    }

    public static bz a(int i2) {
        if (i2 == 0) {
            return AGE_SCREEN_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return AGE_SCREEN_TYPE_OS_DATE_PICKER;
        }
        if (i2 != 2) {
            return null;
        }
        return AGE_SCREEN_TYPE_CUSTOMIZED_TEXT_FIELDS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54685f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54685f);
    }
}
