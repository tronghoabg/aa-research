package defpackage;

/* loaded from: classes3.dex */
public final class abwf extends abnv implements abox {
    public static final abwf a;

    static {
        abwf abwfVar = new abwf();
        a = abwfVar;
        abnv.P(abwf.class, abwfVar);
    }

    private abwf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abwf();
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
        return abnv.L(abwf.class);
    }
}
