package defpackage;

/* loaded from: classes3.dex */
public final class xhm extends abnv implements abox {
    public static final xhm a;
    public int b;
    public xiw c;
    public aboh d = abpf.b;

    static {
        xhm xhmVar = new xhm();
        a = xhmVar;
        abnv.P(xhm.class, xhmVar);
    }

    private xhm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", xkv.class});
        }
        if (i2 == 3) {
            return new xhm();
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
        return abnv.L(xhm.class);
    }
}
