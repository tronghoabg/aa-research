package defpackage;

/* loaded from: classes3.dex */
public final class abvq extends abnv implements abox {
    public static final abvq a;
    public int b;
    public abvg c;
    public abur d;
    public abut e;
    public abvr f;
    public aboh g = abpf.b;
    public abod h = abnw.a;

    static {
        abvq abvqVar = new abvq();
        a = abvqVar;
        abnv.P(abvq.class, abvqVar);
    }

    private abvq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0007,", new Object[]{"b", "c", "d", "e", "f", "g", abvu.class, "h"});
        }
        if (i2 == 3) {
            return new abvq();
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
        return abnv.L(abvq.class);
    }
}
