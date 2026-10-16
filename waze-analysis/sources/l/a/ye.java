package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ye implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ACCEPT(1),
    BACK(2),
    DECLINE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55658g;

    ye(int i2) {
        this.f55658g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55658g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55658g);
    }
}
