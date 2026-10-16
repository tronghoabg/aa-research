package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blx implements com.google.v.eg {
    VEHICLE_TYPE_UNSPECIFIED(0),
    MOTORCYCLE(1),
    PRIVATE(2),
    TAXI(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54273g;

    blx(int i2) {
        this.f54273g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54273g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54273g);
    }
}
