package defpackage;

/* loaded from: classes3.dex */
public final class sym extends abnv implements abox {
    public static final sym a;
    public int b;
    public int c;
    public String d = "";
    public syn e;

    static {
        sym symVar = new sym();
        a = symVar;
        abnv.P(sym.class, symVar);
    }

    private sym() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new sym();
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
        return abnv.L(sym.class);
    }
}
