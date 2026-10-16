package defpackage;

/* loaded from: classes.dex */
public final class qtk extends abnv implements abox {
    public static final qtk a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public qtj g;
    public boolean h;
    public int i;

    static {
        qtk qtkVar = new qtk();
        a = qtkVar;
        abnv.P(qtk.class, qtkVar);
    }

    private qtk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new qtk();
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
        return abnv.L(qtk.class);
    }
}
