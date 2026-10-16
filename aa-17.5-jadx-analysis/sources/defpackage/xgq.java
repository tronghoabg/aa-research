package defpackage;

/* loaded from: classes3.dex */
public final class xgq extends abnv implements abox {
    public static final xgq a;
    public int b = 0;
    public Object c;

    static {
        xgq xgqVar = new xgq();
        a = xgqVar;
        abnv.P(xgq.class, xgqVar);
    }

    private xgq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u00017\u0000\u00024\u0000\u0003:\u0000\u00045\u0000\u0005Ȼ\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", xgo.class, xgp.class, xgn.class});
        }
        if (i2 == 3) {
            return new xgq();
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
        return abnv.L(xgq.class);
    }
}
