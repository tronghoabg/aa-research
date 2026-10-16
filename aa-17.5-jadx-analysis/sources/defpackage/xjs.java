package defpackage;

/* loaded from: classes3.dex */
public final class xjs extends abnv implements abox {
    public static final xjs a;
    public int b;
    public int c = 1;

    static {
        xjs xjsVar = new xjs();
        a = xjsVar;
        abnv.P(xjs.class, xjsVar);
    }

    private xjs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", otu.q});
        }
        if (i2 == 3) {
            return new xjs();
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
        return abnv.L(xjs.class);
    }
}
