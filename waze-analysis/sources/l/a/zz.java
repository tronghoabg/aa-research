package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zz implements com.google.v.eg {
    DIRECTION_UNSPECIFIED(0),
    SAME_SIDE(1),
    OTHER_SIDE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55757f;

    zz(int i2) {
        this.f55757f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55757f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55757f);
    }
}
