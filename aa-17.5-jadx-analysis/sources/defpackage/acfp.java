package defpackage;

/* loaded from: classes3.dex */
public final class acfp extends abnv implements abox {
    public static final acfp a;

    static {
        acfp acfpVar = new acfp();
        a = acfpVar;
        abnv.P(acfp.class, acfpVar);
    }

    private acfp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new acfp();
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
        return abnv.L(acfp.class);
    }
}
