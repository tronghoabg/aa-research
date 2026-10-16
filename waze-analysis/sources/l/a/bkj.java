package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkj implements com.google.v.eg {
    IMPACT_INFO_TYPE_UNSPECIFIED(0),
    MTE(1),
    STREET(2),
    DEFAULT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54170g;

    bkj(int i2) {
        this.f54170g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54170g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54170g);
    }
}
