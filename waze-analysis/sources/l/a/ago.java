package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ago implements com.google.v.eg {
    LOCATION_ISSUE_TYPE_UNSPECIFIED(0),
    TIME_INCONSISTENCY(1),
    LOCATION_INCONSISTENCY(2),
    STALE_LOCATION(3),
    STALE_ACCURACY(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52460h;

    ago(int i2) {
        this.f52460h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52460h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52460h);
    }
}
