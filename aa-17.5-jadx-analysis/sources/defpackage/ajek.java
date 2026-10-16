package defpackage;

/* loaded from: classes2.dex */
public final class ajek extends abnv implements abox {
    public static final ajek a;
    public abod b = abnw.a;

    static {
        ajek ajekVar = new ajek();
        a = ajekVar;
        abnv.P(ajek.class, ajekVar);
    }

    private ajek() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", xln.m});
        }
        if (i2 == 3) {
            return new ajek();
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
        return abnv.L(ajek.class);
    }
}
