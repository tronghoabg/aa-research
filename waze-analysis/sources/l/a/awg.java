package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awg implements com.google.v.eg {
    ROUTE_INSIGHT_UNSPECIFIED(0),
    ROUTE_INSIGHT_INVALID(1),
    ROUTE_INSIGHT_BLOCKED(2),
    ROUTE_INSIGHT_TOLL(3),
    ROUTE_INSIGHT_FERRY(4),
    ROUTE_INSIGHT_UNPAVED(5),
    ROUTE_INSIGHT_DANGEROUS_TURN(6),
    ROUTE_INSIGHT_RESTRICTED_ZONE(7),
    ROUTE_INSIGHT_DANGER_ZONE(8),
    ROUTE_INSIGHT_SCHOOL_ZONE(9),
    ROUTE_INSIGHT_INTERNATIONAL(10),
    ROUTE_INSIGHT_BEACONS(11),
    ROUTE_INSIGHT_HOV(12),
    ROUTE_INSIGHT_BYPASSES_RESTRICTED(13),
    ROUTE_INSIGHT_ENCOURAGEMENT(14),
    ROUTE_INSIGHT_STEPPED_ON_IT(15),
    ROUTE_INSIGHT_ETA_FROM_ML(16),
    ROUTE_INSIGHT_INVALID_FOR_PRIVATE_VEHICLE(17),
    ROUTE_INSIGHT_RESTRICTED_BY_LICENSE_PLATE(18),
    ROUTE_INSIGHT_TOLL_FOR_AVOIDERS(19),
    ROUTE_INSIGHT_UNNATURAL(20),
    ROUTE_INSIGHT_PRIMARY_FOR_AVOIDERS(21),
    ROUTE_INSIGHT_SAFETY_INCIDENT(22),
    ROUTE_INSIGHT_BYPASSES_SAFETY_INCIDENT(23),
    UNRECOGNIZED(-1);

    private final int A;

    awg(int i2) {
        this.A = i2;
    }

    public static awg a(int i2) {
        switch (i2) {
            case 0:
                return ROUTE_INSIGHT_UNSPECIFIED;
            case 1:
                return ROUTE_INSIGHT_INVALID;
            case 2:
                return ROUTE_INSIGHT_BLOCKED;
            case 3:
                return ROUTE_INSIGHT_TOLL;
            case 4:
                return ROUTE_INSIGHT_FERRY;
            case 5:
                return ROUTE_INSIGHT_UNPAVED;
            case 6:
                return ROUTE_INSIGHT_DANGEROUS_TURN;
            case 7:
                return ROUTE_INSIGHT_RESTRICTED_ZONE;
            case 8:
                return ROUTE_INSIGHT_DANGER_ZONE;
            case 9:
                return ROUTE_INSIGHT_SCHOOL_ZONE;
            case 10:
                return ROUTE_INSIGHT_INTERNATIONAL;
            case 11:
                return ROUTE_INSIGHT_BEACONS;
            case 12:
                return ROUTE_INSIGHT_HOV;
            case 13:
                return ROUTE_INSIGHT_BYPASSES_RESTRICTED;
            case 14:
                return ROUTE_INSIGHT_ENCOURAGEMENT;
            case 15:
                return ROUTE_INSIGHT_STEPPED_ON_IT;
            case 16:
                return ROUTE_INSIGHT_ETA_FROM_ML;
            case 17:
                return ROUTE_INSIGHT_INVALID_FOR_PRIVATE_VEHICLE;
            case 18:
                return ROUTE_INSIGHT_RESTRICTED_BY_LICENSE_PLATE;
            case 19:
                return ROUTE_INSIGHT_TOLL_FOR_AVOIDERS;
            case 20:
                return ROUTE_INSIGHT_UNNATURAL;
            case 21:
                return ROUTE_INSIGHT_PRIMARY_FOR_AVOIDERS;
            case 22:
                return ROUTE_INSIGHT_SAFETY_INCIDENT;
            case 23:
                return ROUTE_INSIGHT_BYPASSES_SAFETY_INCIDENT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
