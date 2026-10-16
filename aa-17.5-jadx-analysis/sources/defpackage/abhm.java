package defpackage;

/* loaded from: classes3.dex */
public final class abhm extends abnv implements abox {
    public static final abhm a;
    public int b;
    public double c;
    public double d;

    static {
        abhm abhmVar = new abhm();
        a = abhmVar;
        abnv.P(abhm.class, abhmVar);
    }

    private abhm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abhm();
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
        return abnv.L(abhm.class);
    }
}
