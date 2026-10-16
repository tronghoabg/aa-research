package defpackage;

/* loaded from: classes3.dex */
public final class acfg extends abnv implements abox {
    public static final acfg a;

    static {
        acfg acfgVar = new acfg();
        a = acfgVar;
        abnv.P(acfg.class, acfgVar);
    }

    private acfg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acfg();
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
        return abnv.L(acfg.class);
    }
}
