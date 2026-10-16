package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ber implements com.google.v.eg {
    SUBTYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    HISTORY(3),
    OTHER(4),
    ON(6),
    OFF(7),
    ALERTS_ONLY(8),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f53831k;

    ber(int i2) {
        this.f53831k = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53831k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53831k);
    }
}
