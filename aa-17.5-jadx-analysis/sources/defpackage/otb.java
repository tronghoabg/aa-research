package defpackage;

/* loaded from: classes2.dex */
public final class otb extends abnv implements abox {
    public static final otb a;

    static {
        otb otbVar = new otb();
        a = otbVar;
        abnv.P(otb.class, otbVar);
    }

    private otb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new otb();
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
        return abnv.L(otb.class);
    }
}
