package defpackage;

/* loaded from: classes3.dex */
public final class tao extends abnv implements abox {
    public static final tao a;
    public int b = 0;
    public Object c;
    public int d;
    private int e;

    static {
        tao taoVar = new tao();
        a = taoVar;
        abnv.P(tao.class, taoVar);
    }

    private tao() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002:\u0000\u00037\u0000\u0004;\u0000", new Object[]{"c", "b", "e", "d", tap.a});
        }
        if (i2 == 3) {
            return new tao();
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
        return abnv.L(tao.class);
    }
}
