package defpackage;

/* loaded from: classes3.dex */
public final class xgv extends abnv implements abox {
    public static final xgv a;
    public int b;
    public xgt c;
    public xgt d;
    public int e;
    public float f;
    public float g;

    static {
        xgv xgvVar = new xgv();
        a = xgvVar;
        abnv.P(xgv.class, xgvVar);
    }

    private xgv() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\f\u0007\u0001\b\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xgv();
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
        return abnv.L(xgv.class);
    }
}
