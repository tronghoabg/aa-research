package defpackage;

/* loaded from: classes.dex */
public final class xoa extends abnv implements abox {
    public static final xoa a;
    public int b;
    public abms c;
    public abms d;
    public abms e;
    public String f;
    public String g;
    public xgs h;

    static {
        xoa xoaVar = new xoa();
        a = xoaVar;
        abnv.P(xoa.class, xoaVar);
    }

    private xoa() {
        abms abmsVar = abms.d;
        this.c = abmsVar;
        this.d = abmsVar;
        this.e = abmsVar;
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new xoa();
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
        return abnv.L(xoa.class);
    }
}
