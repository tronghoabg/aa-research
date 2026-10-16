package defpackage;

/* loaded from: classes3.dex */
public final class abcp extends abnv implements abox {
    public static final abcp a;
    public int b = 9;
    public int c = 2;
    private int d;

    static {
        abcp abcpVar = new abcp();
        a = abcpVar;
        abnv.P(abcp.class, abcpVar);
    }

    private abcp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", abce.d, "c", abce.c});
        }
        if (i2 == 3) {
            return new abcp();
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
        return abnv.L(abcp.class);
    }
}
