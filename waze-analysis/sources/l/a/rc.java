package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum rc implements com.google.v.eg {
    DESTINATION_REPORTING_NAVIGATION_DESTINATION_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    OTHER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55342g;

    rc(int i2) {
        this.f55342g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55342g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55342g);
    }
}
