package defpackage;

/* loaded from: classes3.dex */
public final class abko extends abnv implements abox {
    public static final abko a;

    static {
        abko abkoVar = new abko();
        a = abkoVar;
        abnv.P(abko.class, abkoVar);
    }

    private abko() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abko();
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
        return abnv.L(abko.class);
    }
}
