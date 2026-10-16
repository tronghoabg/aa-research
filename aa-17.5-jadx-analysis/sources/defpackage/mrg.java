package defpackage;

/* loaded from: classes2.dex */
public final class mrg extends abnv implements abox {
    public static final mrg a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        mrg mrgVar = new mrg();
        a = mrgVar;
        abnv.P(mrg.class, mrgVar);
    }

    private mrg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003<\u0000\u0004<\u0000\u0005ဈ\u0002", new Object[]{"d", "c", "b", "e", mre.class, mrc.class, "f"});
        }
        if (i2 == 3) {
            return new mrg();
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
        return abnv.L(mrg.class);
    }
}
