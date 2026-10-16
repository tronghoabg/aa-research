package defpackage;

/* loaded from: classes3.dex */
public final class xpz extends abnv implements abox {
    public static final xpz a;
    public int b;
    public int c;
    public int d;
    public int e;
    public abod f = abnw.a;
    public xgr g;
    public xpu h;

    static {
        xpz xpzVar = new xpz();
        a = xpzVar;
        abnv.P(xpz.class, xpzVar);
    }

    private xpz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004\u0016\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", xou.j, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xpz();
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
        return abnv.L(xpz.class);
    }
}
