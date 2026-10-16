package defpackage;

/* loaded from: classes3.dex */
public final class abxs extends abnv implements abox {
    public static final abxs a;
    public int b;
    public abxq c;
    public abxr d;

    static {
        abxs abxsVar = new abxs();
        a = abxsVar;
        abnv.P(abxs.class, abxsVar);
    }

    private abxs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abxs();
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
        return abnv.L(abxs.class);
    }
}
