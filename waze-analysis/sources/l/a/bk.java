package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bk implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    CAR_WASH(1),
    CHARGING_STATION(2),
    GAS_STATION(3),
    NO_RESULTS(4),
    PARKING_LOT(5),
    VENUE_FAILED(6),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    private final int f54126j;

    bk(int i2) {
        this.f54126j = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54126j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54126j);
    }
}
