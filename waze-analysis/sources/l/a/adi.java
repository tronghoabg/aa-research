package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum adi implements com.google.v.eg {
    PLATFORM_SOURCE_UNSPECIFIED(0),
    MOBILE(1),
    CARPLAY(2),
    DASHBOARD_MODE(3),
    AAOS(4),
    AAP(5),
    COOLWALK(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f52259j;

    adi(int i2) {
        this.f52259j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52259j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52259j);
    }
}
