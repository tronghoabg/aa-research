package defpackage;

/* loaded from: classes3.dex */
public final class xkv extends abnv implements abox {
    public static final xkv a;
    public int b;
    public xnl c;
    public int d;

    static {
        xkv xkvVar = new xkv();
        a = xkvVar;
        abnv.P(xkv.class, xkvVar);
    }

    private xkv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", xku.a});
        }
        if (i2 == 3) {
            return new xkv();
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
        return abnv.L(xkv.class);
    }
}
