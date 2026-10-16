package defpackage;

/* loaded from: classes3.dex */
public final class abvl extends abnv implements abox {
    public static final abvl a;

    static {
        abvl abvlVar = new abvl();
        a = abvlVar;
        abnv.P(abvl.class, abvlVar);
    }

    private abvl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abvl();
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
        return abnv.L(abvl.class);
    }
}
