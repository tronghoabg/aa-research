package defpackage;

/* loaded from: classes3.dex */
public final class abxv extends abnv implements abox {
    public static final abxv a;
    public abnf b;
    public abnf c;
    private int d;

    static {
        abxv abxvVar = new abxv();
        a = abxvVar;
        abnv.P(abxv.class, abxvVar);
    }

    private abxv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abxv();
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
        return abnv.L(abxv.class);
    }
}
