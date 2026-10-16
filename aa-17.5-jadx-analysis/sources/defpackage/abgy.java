package defpackage;

/* loaded from: classes3.dex */
public final class abgy extends abnv implements abox {
    public static final abgy a;
    public int b;
    public int c;
    public String d = "";

    static {
        abgy abgyVar = new abgy();
        a = abgyVar;
        abnv.P(abgy.class, abgyVar);
    }

    private abgy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", abce.t, "d"});
        }
        if (i2 == 3) {
            return new abgy();
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
        return abnv.L(abgy.class);
    }
}
