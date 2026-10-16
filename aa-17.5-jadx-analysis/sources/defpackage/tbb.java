package defpackage;

/* loaded from: classes3.dex */
public final class tbb extends abnv implements abox {
    public static final tbb a;
    public int b;
    public boolean c;
    public long g;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        tbb tbbVar = new tbb();
        a = tbbVar;
        abnv.P(tbb.class, tbbVar);
    }

    private tbb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new tbb();
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
        return abnv.L(tbb.class);
    }
}
