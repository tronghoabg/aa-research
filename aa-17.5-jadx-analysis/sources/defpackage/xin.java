package defpackage;

/* loaded from: classes3.dex */
public final class xin extends abnv implements abox {
    public static final xin a;
    public int b;
    public xgi c;
    public xgq d;
    public int e;

    static {
        xin xinVar = new xin();
        a = xinVar;
        abnv.P(xin.class, xinVar);
    }

    private xin() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xin();
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
        return abnv.L(xin.class);
    }
}
