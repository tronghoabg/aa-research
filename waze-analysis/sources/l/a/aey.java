package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aey implements com.google.v.eg {
    VEHICLE_TYPE_UNSPECIFIED(0),
    PRIVATE(1),
    MOTORCYCLE(2),
    TAXI(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52414g;

    aey(int i2) {
        this.f52414g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52414g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52414g);
    }
}
