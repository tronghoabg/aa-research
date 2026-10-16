package defpackage;

/* loaded from: classes3.dex */
public final class zpe extends abnv implements abox {
    public static final zpe a;
    public int b;
    public int c;

    static {
        zpe zpeVar = new zpe();
        a = zpeVar;
        abnv.P(zpe.class, zpeVar);
    }

    private zpe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0003\u0006\u0002\u0000\u0000\u0000\u0003\f\u0006\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zpe();
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
        return abnv.L(zpe.class);
    }
}
