package defpackage;

/* loaded from: classes2.dex */
public final class rrm extends abnv implements abox {
    public static final rrm a;
    public int b;
    public rrj c;

    static {
        rrm rrmVar = new rrm();
        a = rrmVar;
        abnv.P(rrm.class, rrmVar);
    }

    private rrm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new rrm();
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
        return abnv.L(rrm.class);
    }
}
