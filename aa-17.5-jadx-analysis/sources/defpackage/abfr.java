package defpackage;

/* loaded from: classes3.dex */
public final class abfr extends abnv implements abox {
    public static final abfr a;

    static {
        abfr abfrVar = new abfr();
        a = abfrVar;
        abnv.P(abfr.class, abfrVar);
    }

    private abfr() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abfr();
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
        return abnv.L(abfr.class);
    }
}
