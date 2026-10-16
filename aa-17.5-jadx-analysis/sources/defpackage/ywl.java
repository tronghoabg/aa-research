package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes.dex */
public final class ywl implements abob {
    private final /* synthetic */ int v;
    public static final abob u = new ywl(20);
    public static final abob t = new ywl(19);
    public static final abob s = new ywl(18);
    public static final abob r = new ywl(17);
    public static final abob q = new ywl(16);
    public static final abob p = new ywl(15);
    public static final abob o = new ywl(14);
    public static final abob n = new ywl(13);
    public static final abob m = new ywl(12);
    public static final abob l = new ywl(11);
    public static final abob k = new ywl(10);
    public static final abob j = new ywl(9);
    public static final abob i = new ywl(8);
    static final abob h = new ywl(7);
    public static final abob g = new ywl(6);
    static final abob f = new ywl(5);
    public static final abob e = new ywl(4);
    public static final abob d = new ywl(3);
    public static final abob c = new ywl(2);
    public static final abob b = new ywl(1);
    public static final abob a = new ywl(0);

    private ywl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.abob
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return aclh.k(i2) != 0;
            case 1:
                return a.aP(i2);
            case 2:
                return a.aM(i2);
            case 3:
                return yxi.b(i2) != null;
            case 4:
                return yxo.b(i2) != null;
            case 5:
                return a.aM(i2);
            case 6:
                return yyv.b(i2) != null;
            case 7:
                return a.aP(i2);
            case 8:
                return yzz.b(i2) != null;
            case 9:
                return a.aL(i2);
            case 10:
                return a.aK(i2);
            case 11:
                return a.aR(i2);
            case 12:
                return a.aK(i2);
            case 13:
                return a.aR(i2);
            case 14:
                switch (i2) {
                    case 0:
                    case 1:
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
                    case 19:
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
                        return true;
                    default:
                        return false;
                }
            case 15:
                return a.aK(i2);
            case 16:
                switch (i2) {
                    case 0:
                    case 1:
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                switch (i2) {
                    case 0:
                    case 1:
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
                        return true;
                    default:
                        return false;
                }
            case 18:
                return zkd.b(i2) != null;
            case 19:
                return zkt.t(i2) != 0;
            default:
                return a.aK(i2);
        }
    }
}
