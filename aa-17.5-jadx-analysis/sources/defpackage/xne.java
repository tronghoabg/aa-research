package defpackage;

/* loaded from: classes3.dex */
public final class xne extends abnv implements abox {
    public static final xne a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public xmq g;
    public long h;

    static {
        xne xneVar = new xne();
        a = xneVar;
        abnv.P(xne.class, xneVar);
    }

    private xne() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xne();
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
        return abnv.L(xne.class);
    }
}
