package defpackage;

/* loaded from: classes3.dex */
public final class abhr extends abnv implements abox {
    public static final abhr a;

    static {
        abhr abhrVar = new abhr();
        a = abhrVar;
        abnv.P(abhr.class, abhrVar);
    }

    private abhr() {
        abor aborVar = abor.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abhr();
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
        return abnv.L(abhr.class);
    }
}
