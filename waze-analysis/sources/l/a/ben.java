package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ben implements com.google.v.eg {
    SUBTYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    FAVORITE(3),
    ON(6),
    OFF(7),
    ALERTS_ONLY(8),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f53814j;

    ben(int i2) {
        this.f53814j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53814j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53814j);
    }
}
