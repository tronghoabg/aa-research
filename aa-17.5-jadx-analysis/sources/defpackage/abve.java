package defpackage;

/* loaded from: classes3.dex */
public final class abve extends abnv implements abox {
    public static final abve a;
    public int b;
    public int c = 0;
    public Object d;
    public abnf e;

    static {
        abve abveVar = new abve();
        a = abveVar;
        abnv.P(abve.class, abveVar);
    }

    private abve() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", abvd.class, abvb.class, abuu.class, abva.class, abvc.class});
        }
        if (i2 == 3) {
            return new abve();
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
        return abnv.L(abve.class);
    }
}
