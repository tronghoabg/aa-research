package i.b;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum l implements eg {
    CHIT_CHAT(0),
    POLICE(1),
    ACCIDENT(2),
    JAM(3),
    TRAFFIC_INFO(4),
    HAZARD(5),
    MISC(6),
    CONSTRUCTION(7),
    PARKING(8),
    DYNAMIC(9),
    CAMERA(10),
    PARKED(11),
    ROAD_CLOSED(12),
    TURN_CLOSED(16),
    UNKKNOWN(13),
    SYSTEM_ROAD_CLOSED(14),
    SOS(15),
    NEW_BAD_WEATHER(100),
    NEW_LANE_CLOSED(101),
    PERSONAL_SAFETY(104);

    private final int v;

    l(int i2) {
        this.v = i2;
    }

    public static ei a() {
        return k.f48519a;
    }

    public static l b(int i2) {
        if (i2 == 100) {
            return NEW_BAD_WEATHER;
        }
        if (i2 == 101) {
            return NEW_LANE_CLOSED;
        }
        if (i2 == 104) {
            return PERSONAL_SAFETY;
        }
        switch (i2) {
            case 0:
                return CHIT_CHAT;
            case 1:
                return POLICE;
            case 2:
                return ACCIDENT;
            case 3:
                return JAM;
            case 4:
                return TRAFFIC_INFO;
            case 5:
                return HAZARD;
            case 6:
                return MISC;
            case 7:
                return CONSTRUCTION;
            case 8:
                return PARKING;
            case 9:
                return DYNAMIC;
            case 10:
                return CAMERA;
            case 11:
                return PARKED;
            case 12:
                return ROAD_CLOSED;
            case 13:
                return UNKKNOWN;
            case 14:
                return SYSTEM_ROAD_CLOSED;
            case 15:
                return SOS;
            case 16:
                return TURN_CLOSED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
