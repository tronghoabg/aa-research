package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes3.dex */
public final class achi implements abob {
    private final /* synthetic */ int v;
    public static final abob u = new achi(20);
    public static final abob t = new achi(19);
    public static final abob s = new achi(18);
    public static final abob r = new achi(17);
    public static final abob q = new achi(16);
    public static final abob p = new achi(15);
    public static final abob o = new achi(14);
    public static final abob n = new achi(13);
    public static final abob m = new achi(12);
    public static final abob l = new achi(11);
    public static final abob k = new achi(10);
    public static final abob j = new achi(9);
    public static final abob i = new achi(8);
    public static final abob h = new achi(7);
    public static final abob g = new achi(6);
    public static final abob f = new achi(5);
    public static final abob e = new achi(4);
    public static final abob d = new achi(3);
    public static final abob c = new achi(2);
    static final abob b = new achi(1);
    static final abob a = new achi(0);

    private achi(int i2) {
        this.v = i2;
    }

    @Override // defpackage.abob
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 1:
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return achn.b(i2) != null;
            case 3:
                return a.aw(i2) != 0;
            case 4:
                return acib.b(i2) != null;
            case 5:
                return acif.b(i2) != null;
            case 6:
                return acig.b(i2) != null;
            case 7:
                return acii.b(i2) != null;
            case 8:
                return acik.b(i2) != null;
            case 9:
                return acil.b(i2) != null;
            case 10:
                return acin.b(i2) != null;
            case 11:
                return acis.b(i2) != null;
            case 12:
                switch (i2) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 37:
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                        return true;
                    case 1:
                    case 19:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    default:
                        return false;
                }
            case 13:
                return a.aL(i2);
            case 14:
                return a.aL(i2);
            case 15:
                return aiqt.a(i2) != 0;
            case 16:
                return a.aQ(i2);
            case 17:
                return a.aK(i2);
            case 18:
                return a.aT(i2) != 0;
            case 19:
                return a.aP(i2);
            default:
                return a.aO(i2);
        }
    }
}
