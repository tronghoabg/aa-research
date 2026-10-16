package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum go implements com.google.v.eg {
    RESULT_SOURCE_UNSPECIFIED(0),
    GOOGLE(1),
    WAZE(2),
    WAZE_AD(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54924g;

    go(int i2) {
        this.f54924g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54924g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54924g);
    }
}
