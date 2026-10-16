package defpackage;

/* loaded from: classes3.dex */
public final class tap implements abob {
    private final /* synthetic */ int v;
    public static final abob u = new tap(20);
    public static final abob t = new tap(19);
    public static final abob s = new tap(18);
    public static final abob r = new tap(17);
    public static final abob q = new tap(16);
    public static final abob p = new tap(15);
    public static final abob o = new tap(14);
    public static final abob n = new tap(13);
    public static final abob m = new tap(12);
    public static final abob l = new tap(11);
    public static final abob k = new tap(10);
    public static final abob j = new tap(9);
    public static final abob i = new tap(8);
    public static final abob h = new tap(7);
    public static final abob g = new tap(6);
    public static final abob f = new tap(5);
    public static final abob e = new tap(4);
    public static final abob d = new tap(3);
    public static final abob c = new tap(2);
    static final abob b = new tap(1);
    static final abob a = new tap(0);

    private tap(int i2) {
        this.v = i2;
    }

    @Override // defpackage.abob
    public final boolean a(int i2) {
        abnz abnzVar = null;
        switch (this.v) {
            case 0:
                return taq.b(i2) != null;
            case 1:
                return a.aL(i2);
            case 2:
                return a.aK(i2);
            case 3:
                if (i2 == 0) {
                    abnzVar = uyf.UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY;
                } else if (i2 == 1) {
                    abnzVar = uyf.NONE;
                } else if (i2 == 2) {
                    abnzVar = uyf.SEQUENTIAL_ON_UI_THREAD;
                } else if (i2 == 3) {
                    abnzVar = uyf.WAIT_ON_UI_THREAD;
                }
                return abnzVar != null;
            case 4:
                if (i2 == 0) {
                    abnzVar = uyg.GMM_SERVER_ONLY;
                } else if (i2 == 1) {
                    abnzVar = uyg.CLEARCUT_SERVICE_ONLY;
                } else if (i2 == 2) {
                    abnzVar = uyg.DUAL_WRITE;
                } else if (i2 == 3) {
                    abnzVar = uyg.NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY;
                } else if (i2 == 4) {
                    abnzVar = uyg.NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE;
                }
                return abnzVar != null;
            case 5:
                return a.aQ(i2);
            case 6:
                return a.aK(i2);
            case 7:
                return a.aK(i2);
            case 8:
                return a.aR(i2);
            case 9:
                return wox.Y(i2) != 0;
            case 10:
                return xgh.b(i2) != null;
            case 11:
                return a.az(i2) != 0;
            case 12:
                return a.aQ(i2);
            case 13:
                return xhc.b(i2) != null;
            case 14:
                return xhv.b(i2) != null;
            case 15:
                return xii.b(i2) != null;
            case 16:
                return a.aw(i2) != 0;
            case 17:
                if (i2 == 0) {
                    abnzVar = xix.CRITICAL_UI_FOCUS_UNKNOWN;
                } else if (i2 == 1) {
                    abnzVar = xix.CRITICAL_UI_FOCUS_PROJECTED;
                } else if (i2 == 2) {
                    abnzVar = xix.CRITICAL_UI_FOCUS_NATIVE;
                }
                return abnzVar != null;
            case 18:
                return wox.D(i2) != 0;
            case 19:
                return a.aU(i2);
            default:
                return a.aR(i2);
        }
    }
}
