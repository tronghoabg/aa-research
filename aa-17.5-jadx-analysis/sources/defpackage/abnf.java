package defpackage;

/* loaded from: classes.dex */
public final class abnf extends abnv implements abox {
    public static final abnf a;
    public long b;
    public int c;

    static {
        abnf abnfVar = new abnf();
        a = abnfVar;
        abnv.P(abnf.class, abnfVar);
    }

    private abnf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abnf();
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
        return abnv.L(abnf.class);
    }
}
