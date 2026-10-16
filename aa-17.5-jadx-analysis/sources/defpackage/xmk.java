package defpackage;

/* loaded from: classes3.dex */
public final class xmk extends abnv implements abox {
    public static final xmk a;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;

    static {
        xmk xmkVar = new xmk();
        a = xmkVar;
        abnv.P(xmk.class, xmkVar);
    }

    private xmk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"b", "c", "d", "e", "f", xku.l, "g", "h"});
        }
        if (i2 == 3) {
            return new xmk();
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
        return abnv.L(xmk.class);
    }
}
