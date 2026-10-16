package defpackage;

/* loaded from: classes.dex */
public final class abpt extends abnv implements abox {
    public static final abpt a;
    public long b;
    public int c;

    static {
        abpt abptVar = new abpt();
        a = abptVar;
        abnv.P(abpt.class, abptVar);
    }

    private abpt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abpt();
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
        return abnv.L(abpt.class);
    }
}
