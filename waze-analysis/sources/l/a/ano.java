package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ano implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    CAR_WASH(1),
    CHARGING_STATION(2),
    GAS_STATION(3),
    PARKING_LOT(4),
    HOME(5),
    WORK(6),
    NO_RESULTS(7),
    NETWORK_ERROR(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f52810l;

    ano(int i2) {
        this.f52810l = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52810l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52810l);
    }
}
