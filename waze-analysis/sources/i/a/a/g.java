package i.a.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum g implements eg {
    STREET(1),
    HIGHWAY(2),
    FREEWAY(3),
    RAMP(4),
    TRAIL(5),
    PRIMARY(6),
    SECONDARY(7),
    _4X4(8),
    WALKWAY(9),
    PEDESTRIAN(10),
    EXIT(11),
    _4X4_TRAIL(14),
    FERRY_CROSSING(15),
    STAIRWAY(16),
    PRIVATE(17),
    RAILROAD(18),
    RUNWAY(19),
    PARKING(20),
    SERVICEROAD(21),
    ALLEY(22),
    ARTIFICIAL_CONNECTOR(90),
    SHORT_CUT(91),
    IGNORE_SEGMENT(92),
    END(99);

    private final int z;

    g(int i2) {
        this.z = i2;
    }

    public static ei a() {
        return f.f48314a;
    }

    public static g b(int i2) {
        if (i2 == 99) {
            return END;
        }
        switch (i2) {
            case 1:
                return STREET;
            case 2:
                return HIGHWAY;
            case 3:
                return FREEWAY;
            case 4:
                return RAMP;
            case 5:
                return TRAIL;
            case 6:
                return PRIMARY;
            case 7:
                return SECONDARY;
            case 8:
                return _4X4;
            case 9:
                return WALKWAY;
            case 10:
                return PEDESTRIAN;
            case 11:
                return EXIT;
            default:
                switch (i2) {
                    case 14:
                        return _4X4_TRAIL;
                    case 15:
                        return FERRY_CROSSING;
                    case 16:
                        return STAIRWAY;
                    case 17:
                        return PRIVATE;
                    case 18:
                        return RAILROAD;
                    case 19:
                        return RUNWAY;
                    case 20:
                        return PARKING;
                    case 21:
                        return SERVICEROAD;
                    case 22:
                        return ALLEY;
                    default:
                        switch (i2) {
                            case 90:
                                return ARTIFICIAL_CONNECTOR;
                            case 91:
                                return SHORT_CUT;
                            case 92:
                                return IGNORE_SEGMENT;
                            default:
                                return null;
                        }
                }
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
