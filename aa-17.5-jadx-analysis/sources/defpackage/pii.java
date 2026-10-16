package defpackage;

/* loaded from: classes2.dex */
public final class pii extends abnv implements abox {
    public static final pii a;
    public String b = "";
    public int c;
    private int d;

    static {
        pii piiVar = new pii();
        a = piiVar;
        abnv.P(pii.class, piiVar);
    }

    private pii() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ለ\u0001\u0003ဌ\u0002", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new pii();
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
        return abnv.L(pii.class);
    }
}
