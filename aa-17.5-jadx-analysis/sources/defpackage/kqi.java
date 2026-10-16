package defpackage;

/* loaded from: classes.dex */
public final class kqi extends abnv implements abox {
    public static final kqi a;
    public int b;
    public abpt c;
    public boolean e;
    public String d = "";
    public String f = "";

    static {
        kqi kqiVar = new kqi();
        a = kqiVar;
        abnv.P(kqi.class, kqiVar);
    }

    private kqi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new kqi();
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
        return abnv.L(kqi.class);
    }
}
