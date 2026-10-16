package i.c.a.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum c implements eg {
    UNKNOWN(0),
    INVALID(1),
    BLOCKED(2),
    TOLL(3),
    FERRY(4),
    UNPAVED(5),
    DANGEROUS_TURN(6),
    RESTRICTED_ZONE(7),
    DANGER_ZONE(8),
    SCHOOL_ZONE(9),
    INTERNATIONAL(10),
    BEACONS(11),
    HOV(12),
    BYPASSES_RESTRICTED(13),
    ENCOURAGEMENT(14),
    STEPPED_ON_IT(15),
    ETA_FROM_ML(16),
    INVALID_FOR_PRIVATE_VEHICLE(17),
    RESTRICTED_BY_LICENSE_PLATE(18),
    TOLL_FOR_AVOIDERS(19),
    UNNATURAL(20),
    PRIMARY_FOR_AVOIDERS(21),
    SAFETY_INCIDENTS_ON_ROUTE(22),
    SAFETY_INCIDENTS_FREE(23);

    private final int z;

    c(int i2) {
        this.z = i2;
    }

    public static ei a() {
        return b.f49572a;
    }

    public static c b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return INVALID;
            case 2:
                return BLOCKED;
            case 3:
                return TOLL;
            case 4:
                return FERRY;
            case 5:
                return UNPAVED;
            case 6:
                return DANGEROUS_TURN;
            case 7:
                return RESTRICTED_ZONE;
            case 8:
                return DANGER_ZONE;
            case 9:
                return SCHOOL_ZONE;
            case 10:
                return INTERNATIONAL;
            case 11:
                return BEACONS;
            case 12:
                return HOV;
            case 13:
                return BYPASSES_RESTRICTED;
            case 14:
                return ENCOURAGEMENT;
            case 15:
                return STEPPED_ON_IT;
            case 16:
                return ETA_FROM_ML;
            case 17:
                return INVALID_FOR_PRIVATE_VEHICLE;
            case 18:
                return RESTRICTED_BY_LICENSE_PLATE;
            case 19:
                return TOLL_FOR_AVOIDERS;
            case 20:
                return UNNATURAL;
            case 21:
                return PRIMARY_FOR_AVOIDERS;
            case 22:
                return SAFETY_INCIDENTS_ON_ROUTE;
            case 23:
                return SAFETY_INCIDENTS_FREE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
