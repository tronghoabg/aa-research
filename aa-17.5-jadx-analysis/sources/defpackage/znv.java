package defpackage;

/* loaded from: classes3.dex */
public final class znv extends abnv implements abox {
    public static final znv a;
    public int b = 0;
    public Object c;

    static {
        znv znvVar = new znv();
        a = znvVar;
        abnv.P(znv.class, znvVar);
    }

    private znv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0001\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003<\u0000", new Object[]{"c", "b", absj.class});
        }
        if (i2 == 3) {
            return new znv();
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
        return abnv.L(znv.class);
    }
}
