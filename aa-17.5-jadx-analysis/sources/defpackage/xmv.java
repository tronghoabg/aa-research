package defpackage;

/* loaded from: classes3.dex */
public final class xmv extends abnv implements abox {
    public static final xmv a;
    public int b;
    public int c;
    public long d;

    static {
        xmv xmvVar = new xmv();
        a = xmvVar;
        abnv.P(xmv.class, xmvVar);
    }

    private xmv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001", new Object[]{"b", "c", xku.o, "d"});
        }
        if (i2 == 3) {
            return new xmv();
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
        return abnv.L(xmv.class);
    }
}
