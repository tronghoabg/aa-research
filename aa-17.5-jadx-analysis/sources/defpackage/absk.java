package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes3.dex */
public final class absk implements abob {
    private final /* synthetic */ int v;
    public static final abob u = new absk(20);
    public static final abob t = new absk(19);
    public static final abob s = new absk(18);
    public static final abob r = new absk(17);
    public static final abob q = new absk(16);
    public static final abob p = new absk(15);
    public static final abob o = new absk(14);
    public static final abob n = new absk(13);
    public static final abob m = new absk(12);
    public static final abob l = new absk(11);
    public static final abob k = new absk(10);
    public static final abob j = new absk(9);
    public static final abob i = new absk(8);
    public static final abob h = new absk(7);
    public static final abob g = new absk(6);
    public static final abob f = new absk(5);
    public static final abob e = new absk(4);
    public static final abob d = new absk(3);
    static final abob c = new absk(2);
    static final abob b = new absk(1);
    static final abob a = new absk(0);

    private absk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.abob
    public final boolean a(int i2) {
        abnz abnzVar = null;
        switch (this.v) {
            case 0:
                switch (i2) {
                    case -1:
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
            case 1:
                if (i2 != 200) {
                    switch (i2) {
                        default:
                            switch (i2) {
                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                case 102:
                                case 103:
                                    break;
                                default:
                                    return false;
                            }
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
                    }
                }
                return true;
            case 2:
                return a.aK(i2);
            case 3:
                return a.aM(i2);
            case 4:
                return a.aK(i2);
            case 5:
                return a.aN(i2);
            case 6:
                return aclh.k(i2) != 0;
            case 7:
                return acbe.b(i2) != null;
            case 8:
                return a.aK(i2);
            case 9:
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
                        return true;
                    default:
                        return false;
                }
            case 10:
                if (i2 == 0) {
                    abnzVar = acbp.UNKNOWN_LOCATION_SHARING_STATE;
                } else if (i2 == 1) {
                    abnzVar = acbp.NOT_SHARING;
                } else if (i2 == 2) {
                    abnzVar = acbp.SHARING_BUT_NOT_REPORTING;
                } else if (i2 == 3) {
                    abnzVar = acbp.SHARING_AND_REPORTING;
                }
                return abnzVar != null;
            case 11:
                return a.aA(i2) != 0;
            case 12:
                return accb.b(i2) != null;
            case 13:
                return acdf.b(i2) != null;
            case 14:
                return acdg.b(i2) != null;
            case 15:
                return acds.b(i2) != null;
            case 16:
                return a.aF(i2) != 0;
            case 17:
                return acdu.b(i2) != null;
            case 18:
                return acef.b(i2) != null;
            case 19:
                if (i2 == 0) {
                    abnzVar = acey.UNKNOWN_RELEASE_LEVEL;
                } else if (i2 == 100) {
                    abnzVar = acey.DEV;
                } else if (i2 == 200) {
                    abnzVar = acey.FISHFOOD;
                } else if (i2 == 300) {
                    abnzVar = acey.DOGFOOD;
                } else if (i2 == 400) {
                    abnzVar = acey.PREVIEW;
                } else if (i2 == 500) {
                    abnzVar = acey.RELEASE;
                }
                return abnzVar != null;
            default:
                return a.aO(i2);
        }
    }
}
