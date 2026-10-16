package defpackage;

/* loaded from: classes3.dex */
public final class uyb extends abnv implements abox {
    public static final uyb a;
    public int b;
    public uyi c;
    public uyd d;
    public uyh e;
    public uyj f;
    public uyk g;
    public uyc h;

    static {
        uyb uybVar = new uyb();
        a = uybVar;
        abnv.P(uyb.class, uybVar);
    }

    private uyb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new uyb();
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
        return abnv.L(uyb.class);
    }
}
