package defpackage;

/* loaded from: classes3.dex */
public final class abfc extends abnv implements abox {
    public static final abfc a;
    public int b;
    public abca c;
    public abey d;

    static {
        abfc abfcVar = new abfc();
        a = abfcVar;
        abnv.P(abfc.class, abfcVar);
    }

    private abfc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abfc();
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
        return abnv.L(abfc.class);
    }
}
