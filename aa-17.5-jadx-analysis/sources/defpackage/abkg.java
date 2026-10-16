package defpackage;

/* loaded from: classes3.dex */
public final class abkg extends abnv implements abox {
    public static final abkg a;
    public abkx b;
    private int c;

    static {
        abkg abkgVar = new abkg();
        a = abkgVar;
        abnv.P(abkg.class, abkgVar);
    }

    private abkg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abkg();
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
        return abnv.L(abkg.class);
    }
}
