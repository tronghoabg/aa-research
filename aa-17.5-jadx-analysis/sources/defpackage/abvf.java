package defpackage;

/* loaded from: classes3.dex */
public final class abvf extends abnv implements abox {
    public static final abvf a;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        abvf abvfVar = new abvf();
        a = abvfVar;
        abnv.P(abvf.class, abvfVar);
    }

    private abvf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"c", "b", "e", "d", abwg.class, abwe.class, abwh.class, abwf.class});
        }
        if (i2 == 3) {
            return new abvf();
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
        return abnv.L(abvf.class);
    }
}
