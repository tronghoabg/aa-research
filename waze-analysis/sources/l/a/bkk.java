package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bkk implements com.google.v.eg {
    IMPACT_TYPE_UNSPECIFIED(0),
    UNREACHABLE_DESTINATION_LONG(1),
    UNAVAILABLE_PREFERRED_ROUTE(2),
    UNAVAILABLE_NATURAL_ROUTE(3),
    LONGER_DRIVE_TIME(4),
    UNREACHABLE_DESTINATION_SHORT(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f54179i;

    bkk(int i2) {
        this.f54179i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54179i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54179i);
    }
}
