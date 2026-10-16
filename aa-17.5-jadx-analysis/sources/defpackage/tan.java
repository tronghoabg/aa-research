package defpackage;

/* loaded from: classes3.dex */
public final class tan extends abnv implements abox {
    public static final tan a;
    public int b = 0;
    public Object c;

    static {
        tan tanVar = new tan();
        a = tanVar;
        abnv.P(tan.class, tanVar);
    }

    private tan() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", tag.class});
        }
        if (i2 == 3) {
            return new tan();
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
        return abnv.L(tan.class);
    }
}
