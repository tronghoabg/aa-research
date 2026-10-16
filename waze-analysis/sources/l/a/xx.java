package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum xx implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    BACK(1),
    CLOSE(2),
    CONFIRM(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55647g;

    xx(int i2) {
        this.f55647g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55647g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55647g);
    }
}
