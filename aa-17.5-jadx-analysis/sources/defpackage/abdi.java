package defpackage;

/* loaded from: classes3.dex */
public final class abdi extends abnv implements abox {
    public static final abdi a;
    public abdh b;
    private int c;

    static {
        abdi abdiVar = new abdi();
        a = abdiVar;
        abnv.P(abdi.class, abdiVar);
    }

    private abdi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abdi();
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
        return abnv.L(abdi.class);
    }
}
