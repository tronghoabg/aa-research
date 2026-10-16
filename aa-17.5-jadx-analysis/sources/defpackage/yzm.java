package defpackage;

/* loaded from: classes.dex */
public final class yzm extends abnv implements abox {
    public static final yzm a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;

    static {
        yzm yzmVar = new yzm();
        a = yzmVar;
        abnv.P(yzm.class, yzmVar);
    }

    private yzm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new yzm();
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
        return abnv.L(yzm.class);
    }
}
