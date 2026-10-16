package defpackage;

/* loaded from: classes3.dex */
public final class zbe extends abnv implements abox {
    public static final zbe a;
    public int b;
    public int c;

    static {
        zbe zbeVar = new zbe();
        a = zbeVar;
        abnv.P(zbe.class, zbeVar);
    }

    private zbe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ywl.k});
        }
        if (i2 == 3) {
            return new zbe();
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
        return abnv.L(zbe.class);
    }
}
