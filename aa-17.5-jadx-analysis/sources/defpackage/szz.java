package defpackage;

/* loaded from: classes3.dex */
public final class szz extends abnv implements abox {
    public static final szz a;

    static {
        szz szzVar = new szz();
        a = szzVar;
        abnv.P(szz.class, szzVar);
    }

    private szz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new szz();
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
        return abnv.L(szz.class);
    }
}
