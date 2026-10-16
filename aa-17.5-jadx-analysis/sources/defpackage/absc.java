package defpackage;

/* loaded from: classes3.dex */
public final class absc extends abnv implements abox {
    public static final absc a;
    public int b = 0;
    public Object c;

    static {
        absc abscVar = new absc();
        a = abscVar;
        abnv.P(absc.class, abscVar);
    }

    private absc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", absa.class, absb.class});
        }
        if (i2 == 3) {
            return new absc();
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
        return abnv.L(absc.class);
    }
}
