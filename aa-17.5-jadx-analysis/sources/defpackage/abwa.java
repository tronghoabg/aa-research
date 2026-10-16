package defpackage;

/* loaded from: classes3.dex */
public final class abwa extends abnv implements abox {
    public static final abwa a;
    public int b;
    public abvz c;

    static {
        abwa abwaVar = new abwa();
        a = abwaVar;
        abnv.P(abwa.class, abwaVar);
    }

    private abwa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abwa();
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
        return abnv.L(abwa.class);
    }
}
