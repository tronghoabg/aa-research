package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum avr implements com.google.v.eg {
    RESULT_UNSPECIFIED(0),
    DISPLAYED(1),
    DISPLAYED_ALERTER_ONLY(2),
    IGNORED(3),
    SILENT(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f53270h;

    avr(int i2) {
        this.f53270h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53270h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53270h);
    }
}
