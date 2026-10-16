package defpackage;

/* loaded from: classes3.dex */
public final class tax extends abnv implements abox {
    public static final tax a;

    static {
        tax taxVar = new tax();
        a = taxVar;
        abnv.P(tax.class, taxVar);
    }

    private tax() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new tax();
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
        return abnv.L(tax.class);
    }
}
