package defpackage;

/* loaded from: classes.dex */
public final class yyy extends abnv implements abox {
    public static final yyy a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        yyy yyyVar = new yyy();
        a = yyyVar;
        abnv.P(yyy.class, yyyVar);
    }

    private yyy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002:\u0000\u0003<\u0000\u00047\u0000", new Object[]{"d", "c", "b", "e", yyx.class});
        }
        if (i2 == 3) {
            return new yyy();
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
        return abnv.L(yyy.class);
    }
}
