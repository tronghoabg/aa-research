package defpackage;

/* loaded from: classes3.dex */
public final class uyc extends abnv implements abox {
    public static final uyc a;
    public int b;
    public boolean c;

    static {
        uyc uycVar = new uyc();
        a = uycVar;
        abnv.P(uyc.class, uycVar);
    }

    private uyc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new uyc();
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
        return abnv.L(uyc.class);
    }
}
