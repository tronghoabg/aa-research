package defpackage;

/* loaded from: classes3.dex */
public final class xmq extends abnv implements abox {
    public static final xmq a;
    public int b;
    public abms c = abms.d;

    static {
        xmq xmqVar = new xmq();
        a = xmqVar;
        abnv.P(xmq.class, xmqVar);
    }

    private xmq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xmq();
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
        return abnv.L(xmq.class);
    }
}
