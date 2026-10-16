package defpackage;

/* loaded from: classes3.dex */
public final class abng extends abnv implements abox {
    public static final abng a;

    static {
        abng abngVar = new abng();
        a = abngVar;
        abnv.P(abng.class, abngVar);
    }

    private abng() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new abng();
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
        return abnv.L(abng.class);
    }
}
