package defpackage;

/* loaded from: classes3.dex */
public final class abkc extends abnv implements abox {
    public static final abkc a;
    public double b;
    public double c;
    private int d;

    static {
        abkc abkcVar = new abkc();
        a = abkcVar;
        abnv.P(abkc.class, abkcVar);
    }

    private abkc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abkc();
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
        return abnv.L(abkc.class);
    }
}
