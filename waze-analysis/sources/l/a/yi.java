package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum yi implements com.google.v.eg {
    VIEW_UNSPECIFIED(0),
    REGULAR(1),
    UNDER_18(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55664f;

    yi(int i2) {
        this.f55664f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55664f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55664f);
    }
}
