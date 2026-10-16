package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aul implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    NORMAL(1),
    QUICK_HAZARD(2),
    QUICK_JAM(3),
    QUICK_POLICE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53211h;

    aul(int i2) {
        this.f53211h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53211h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53211h);
    }
}
