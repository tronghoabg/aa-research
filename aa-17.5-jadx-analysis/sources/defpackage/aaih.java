package defpackage;

/* loaded from: classes3.dex */
public final class aaih extends abnv implements abox {
    public static final aaih a;
    public int b;
    public double c;
    public double d;
    public double e;

    static {
        aaih aaihVar = new aaih();
        a = aaihVar;
        abnv.P(aaih.class, aaihVar);
    }

    private aaih() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0002\u0002က\u0000\u0003က\u0001", new Object[]{"b", "e", "c", "d"});
        }
        if (i2 == 3) {
            return new aaih();
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
        return abnv.L(aaih.class);
    }
}
