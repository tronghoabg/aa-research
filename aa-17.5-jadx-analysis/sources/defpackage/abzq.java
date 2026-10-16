package defpackage;

/* loaded from: classes3.dex */
public final class abzq extends abnv implements abox {
    public static final abzq a;
    public int b;
    public int c;
    public boolean d;
    public long e;

    static {
        abzq abzqVar = new abzq();
        a = abzqVar;
        abnv.P(abzq.class, abzqVar);
    }

    private abzq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001\u0004\u0003\u0004\b\u0007\t\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abzq();
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
        return abnv.L(abzq.class);
    }
}
