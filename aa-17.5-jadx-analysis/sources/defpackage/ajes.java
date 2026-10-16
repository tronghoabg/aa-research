package defpackage;

/* loaded from: classes3.dex */
public final class ajes extends abnv implements abox {
    public static final ajes a;
    public int b;
    public int c;
    public int d;
    public ajeo e;

    static {
        ajes ajesVar = new ajes();
        a = ajesVar;
        abnv.P(ajes.class, ajesVar);
    }

    private ajes() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ajes();
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
        return abnv.L(ajes.class);
    }
}
