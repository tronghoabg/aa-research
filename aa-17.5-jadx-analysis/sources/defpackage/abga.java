package defpackage;

/* loaded from: classes3.dex */
public final class abga extends abnv implements abox {
    public static final abga a;
    public boolean b;
    private int c;

    static {
        abga abgaVar = new abga();
        a = abgaVar;
        abnv.P(abga.class, abgaVar);
    }

    private abga() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abga();
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
        return abnv.L(abga.class);
    }
}
