package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum xv implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    NEAR_STATION(1),
    INSIDE_STATION(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55640f;

    xv(int i2) {
        this.f55640f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55640f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55640f);
    }
}
