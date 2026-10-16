package defpackage;

/* loaded from: classes3.dex */
public final class zqv extends abnv implements abox {
    public static final zqv a;
    public int b;
    private int c;

    static {
        zqv zqvVar = new zqv();
        a = zqvVar;
        abnv.P(zqv.class, zqvVar);
    }

    private zqv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", zli.h});
        }
        if (i2 == 3) {
            return new zqv();
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
        return abnv.L(zqv.class);
    }
}
