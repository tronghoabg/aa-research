package defpackage;

/* loaded from: classes.dex */
public final class abrt extends abnv implements abox {
    public static final abrt a;
    public abog b = abor.a;

    static {
        abrt abrtVar = new abrt();
        a = abrtVar;
        abnv.P(abrt.class, abrtVar);
    }

    private abrt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abrt();
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
        return abnv.L(abrt.class);
    }
}
