package defpackage;

/* loaded from: classes.dex */
public final class yxt extends abnv implements abox {
    public static final yxt a;
    public int b;
    public yxs c;
    public yxq d;
    public int e;
    public aboh f = abpf.b;
    public yxr g;
    public int h;
    public int i;

    static {
        yxt yxtVar = new yxt();
        a = yxtVar;
        abnv.P(yxt.class, yxtVar);
    }

    private yxt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b\u0005ဉ\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", yxp.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new yxt();
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
        return abnv.L(yxt.class);
    }
}
