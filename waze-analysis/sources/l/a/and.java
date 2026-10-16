package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum and implements com.google.v.eg {
    NOT_AVAILABLE(0),
    WIFI(1),
    CELL(2),
    WIMAX(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52778g;

    and(int i2) {
        this.f52778g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52778g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52778g);
    }
}
