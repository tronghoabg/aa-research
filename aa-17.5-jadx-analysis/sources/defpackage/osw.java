package defpackage;

/* loaded from: classes2.dex */
public final class osw extends abnv implements abox {
    public static final osw a;
    public int b;
    public int c;

    static {
        osw oswVar = new osw();
        a = oswVar;
        abnv.P(osw.class, oswVar);
    }

    private osw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", orj.k});
        }
        if (i2 == 3) {
            return new osw();
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
        return abnv.L(osw.class);
    }
}
