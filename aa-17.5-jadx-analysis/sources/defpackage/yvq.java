package defpackage;

/* loaded from: classes3.dex */
public final class yvq extends abnv implements abox {
    public static final yvq a;
    public int b;
    public int c;

    static {
        yvq yvqVar = new yvq();
        a = yvqVar;
        abnv.P(yvq.class, yvqVar);
    }

    private yvq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new yvq();
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
        return abnv.L(yvq.class);
    }
}
