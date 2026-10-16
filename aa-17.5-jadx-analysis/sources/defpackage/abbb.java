package defpackage;

/* loaded from: classes3.dex */
public final class abbb extends abnv implements abox {
    public static final abbb a;
    public int b;
    private int c;

    static {
        abbb abbbVar = new abbb();
        a = abbbVar;
        abnv.P(abbb.class, abbbVar);
    }

    private abbb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abbb();
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
        return abnv.L(abbb.class);
    }
}
