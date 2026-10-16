package defpackage;

/* loaded from: classes3.dex */
public final class xjd extends abnv implements abox {
    public static final xjd a;
    public int b;
    public boolean c;
    public boolean d;
    public abnx e = abmj.a;

    static {
        xjd xjdVar = new xjd();
        a = xjdVar;
        abnv.P(xjd.class, xjdVar);
    }

    private xjd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u0019", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xjd();
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
        return abnv.L(xjd.class);
    }
}
