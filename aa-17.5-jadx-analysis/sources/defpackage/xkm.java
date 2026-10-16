package defpackage;

/* loaded from: classes3.dex */
public final class xkm extends abnv implements abox {
    public static final xkm a;
    public int b;
    public int c = 1;
    public String d = "";
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        xkm xkmVar = new xkm();
        a = xkmVar;
        abnv.P(xkm.class, xkmVar);
    }

    private xkm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", xku.b, "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xkm();
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
        return abnv.L(xkm.class);
    }
}
