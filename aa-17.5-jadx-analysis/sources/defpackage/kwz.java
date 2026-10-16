package defpackage;

/* loaded from: classes.dex */
public final class kwz extends abnv implements abox {
    public static final kwz a;
    public int b;
    public boolean c;

    static {
        kwz kwzVar = new kwz();
        a = kwzVar;
        abnv.P(kwz.class, kwzVar);
    }

    private kwz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new kwz();
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
        return abnv.L(kwz.class);
    }
}
