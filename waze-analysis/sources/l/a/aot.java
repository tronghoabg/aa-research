package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aot implements com.google.v.eg {
    OS_LOCATION_PERMISSION_UNSPECIFIED(0),
    ALWAYS_ON(1),
    WHEN_IN_USE(2),
    NEVER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52897g;

    aot(int i2) {
        this.f52897g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52897g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52897g);
    }
}
