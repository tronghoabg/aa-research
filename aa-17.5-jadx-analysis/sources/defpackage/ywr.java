package defpackage;

/* loaded from: classes.dex */
public final class ywr extends abnv implements abox {
    public static final ywr a;
    public int b;
    public int c;
    public long d;

    static {
        ywr ywrVar = new ywr();
        a = ywrVar;
        abnv.P(ywr.class, ywrVar);
    }

    private ywr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ywr();
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
        return abnv.L(ywr.class);
    }
}
