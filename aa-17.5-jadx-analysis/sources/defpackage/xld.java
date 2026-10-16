package defpackage;

/* loaded from: classes3.dex */
public final class xld extends abnv implements abox {
    public static final xld a;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        xld xldVar = new xld();
        a = xldVar;
        abnv.P(xld.class, xldVar);
    }

    private xld() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", xku.d});
        }
        if (i2 == 3) {
            return new xld();
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
        return abnv.L(xld.class);
    }
}
