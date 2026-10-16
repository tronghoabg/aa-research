package defpackage;

/* loaded from: classes3.dex */
public final class abuo extends abnv implements abox {
    public static final abuo a;
    public int b;
    public String c = "";
    public abod d = abnw.a;
    public int e;

    static {
        abuo abuoVar = new abuo();
        a = abuoVar;
        abnv.P(abuo.class, abuoVar);
    }

    private abuo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abuo();
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
        return abnv.L(abuo.class);
    }
}
