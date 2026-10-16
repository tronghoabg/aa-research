package defpackage;

/* loaded from: classes3.dex */
public final class abxa extends abnv<abxa, abnp> implements abox {
    public static final abxa a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        abxa abxaVar = new abxa();
        a = abxaVar;
        abnv.P(abxa.class, abxaVar);
    }

    private abxa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abxa();
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
        return abnv.L(abxa.class);
    }
}
