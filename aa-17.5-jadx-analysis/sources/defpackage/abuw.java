package defpackage;

/* loaded from: classes3.dex */
public final class abuw extends abnv implements abox {
    public static final abuw a;
    public String b = "";

    static {
        abuw abuwVar = new abuw();
        a = abuwVar;
        abnv.P(abuw.class, abuwVar);
    }

    private abuw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abuw();
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
        return abnv.L(abuw.class);
    }
}
