package defpackage;

/* loaded from: classes3.dex */
public final class abfd extends abnv implements abox {
    public static final abfd a;
    public int b;
    public int c;
    public int d;
    private int e;

    static {
        abfd abfdVar = new abfd();
        a = abfdVar;
        abnv.P(abfd.class, abfdVar);
    }

    private abfd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new abfd();
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
        return abnv.L(abfd.class);
    }
}
