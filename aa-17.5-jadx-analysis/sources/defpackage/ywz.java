package defpackage;

/* loaded from: classes.dex */
public final class ywz extends abnv implements abox {
    public static final ywz a;
    public int b;
    public int c;
    public boolean d;
    public String e = "";

    static {
        ywz ywzVar = new ywz();
        a = ywzVar;
        abnv.P(ywz.class, ywzVar);
    }

    private ywz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ywz();
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
        return abnv.L(ywz.class);
    }
}
