package defpackage;

/* loaded from: classes3.dex */
public final class aazy extends abnv implements abox {
    public static final aazy a;
    public static final abnh e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        aazy aazyVar = new aazy();
        a = aazyVar;
        abnv.P(aazy.class, aazyVar);
        e = abnv.W(abab.a, aazyVar, aazyVar, null, 462018071, abqd.MESSAGE);
    }

    private aazy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aazy();
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
        return abnv.L(aazy.class);
    }
}
