package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bpw implements com.google.v.eg {
    INSTRUCTION_MODE_UNSPECIFIED(0),
    FULL(1),
    BRIEF(2),
    SMART(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54494g;

    bpw(int i2) {
        this.f54494g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54494g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54494g);
    }
}
