package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum cf implements com.google.v.eg {
    BEFORE_OR_AFTER_REPORT_UNSPECIFIED(0),
    BEFORE(1),
    AFTER(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54710f;

    cf(int i2) {
        this.f54710f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54710f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54710f);
    }
}
