package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes2.dex */
public final class oti extends abnv implements abox {
    public static final oti a;
    public static final abnh c;
    public orm b;
    private int d;

    static {
        oti otiVar = new oti();
        a = otiVar;
        abnv.P(oti.class, otiVar);
        c = abnv.W(osn.a, otiVar, otiVar, null, EnergyProfile.EVCONNECTOR_TYPE_OTHER, abqd.MESSAGE);
    }

    private oti() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new oti();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(oti.class);
    }
}
