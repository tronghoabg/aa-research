package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ww implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    CTA(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55617e;

    ww(int i2) {
        this.f55617e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55617e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55617e);
    }
}
