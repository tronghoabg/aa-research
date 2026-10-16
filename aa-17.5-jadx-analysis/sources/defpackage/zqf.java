package defpackage;

/* loaded from: classes3.dex */
public final class zqf extends abnv implements abox {
    public static final zqf a;

    static {
        zqf zqfVar = new zqf();
        a = zqfVar;
        abnv.P(zqf.class, zqfVar);
    }

    private zqf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zqf();
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
        return abnv.L(zqf.class);
    }
}
