package defpackage;

/* loaded from: classes3.dex */
public final class abuu extends abnv implements abox {
    public static final abuu a;
    public boolean b;

    static {
        abuu abuuVar = new abuu();
        a = abuuVar;
        abnv.P(abuu.class, abuuVar);
    }

    private abuu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abuu();
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
        return abnv.L(abuu.class);
    }
}
