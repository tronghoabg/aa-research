package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class xli extends abnv implements abox {
    public static final xli a;
    public int b;
    public int e;
    public int g;
    public int h;
    private byte i = 2;
    public String c = "";
    public int d = 1;
    public abms f = abms.d;

    static {
        xli xliVar = new xli();
        a = xliVar;
        abnv.P(xli.class, xliVar);
    }

    private xli() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ည\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", xku.i, "e", xku.h, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xli();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xli.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
