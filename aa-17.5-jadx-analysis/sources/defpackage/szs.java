package defpackage;

/* loaded from: classes3.dex */
public final class szs extends abnv implements abox {
    public static final szs a;
    public int b = 0;
    public Object c;

    static {
        szs szsVar = new szs();
        a = szsVar;
        abnv.P(szs.class, szsVar);
    }

    private szs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", tal.class, szr.class});
        }
        if (i2 == 3) {
            return new szs();
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
        return abnv.L(szs.class);
    }
}
