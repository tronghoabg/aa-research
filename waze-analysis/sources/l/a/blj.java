package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blj implements com.google.v.eg {
    IN_CAR_CONTENT_ELEMENT_TYPE_UNSPECIFIED(0),
    RISK_AREA(1),
    CARBON_EMISSION(2),
    TOLL(3),
    USUAL_ROUTE(4),
    TRAFFIC_STATUS(5),
    BADGES(6),
    REPORTS(7),
    VIA(8),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f54234l;

    blj(int i2) {
        this.f54234l = i2;
    }

    public static blj a(int i2) {
        switch (i2) {
            case 0:
                return IN_CAR_CONTENT_ELEMENT_TYPE_UNSPECIFIED;
            case 1:
                return RISK_AREA;
            case 2:
                return CARBON_EMISSION;
            case 3:
                return TOLL;
            case 4:
                return USUAL_ROUTE;
            case 5:
                return TRAFFIC_STATUS;
            case 6:
                return BADGES;
            case 7:
                return REPORTS;
            case 8:
                return VIA;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54234l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54234l);
    }
}
