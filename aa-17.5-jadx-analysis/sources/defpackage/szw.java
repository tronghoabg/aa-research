package defpackage;

/* loaded from: classes3.dex */
public final class szw extends abnv implements abox {
    public static final szw a;

    static {
        szw szwVar = new szw();
        a = szwVar;
        abnv.P(szw.class, szwVar);
    }

    private szw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new szw();
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
        return abnv.L(szw.class);
    }
}
