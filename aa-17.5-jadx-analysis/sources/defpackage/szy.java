package defpackage;

/* loaded from: classes3.dex */
public final class szy extends abnv implements abox {
    public static final szy a;
    public int b = 0;
    public Object c;

    static {
        szy szyVar = new szy();
        a = szyVar;
        abnv.P(szy.class, szyVar);
    }

    private szy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", osw.class, osb.class, osa.class});
        }
        if (i2 == 3) {
            return new szy();
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
        return abnv.L(szy.class);
    }
}
