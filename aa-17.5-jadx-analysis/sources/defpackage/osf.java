package defpackage;

/* loaded from: classes2.dex */
public final class osf extends abnv implements abox {
    public static final osf a;

    static {
        osf osfVar = new osf();
        a = osfVar;
        abnv.P(osf.class, osfVar);
    }

    private osf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new osf();
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
        return abnv.L(osf.class);
    }
}
