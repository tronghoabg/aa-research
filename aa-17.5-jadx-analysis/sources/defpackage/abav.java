package defpackage;

/* loaded from: classes3.dex */
public final class abav extends abnv implements abox {
    public static final abav a;
    public abod b = abnw.a;

    static {
        abav abavVar = new abav();
        a = abavVar;
        abnv.P(abav.class, abavVar);
    }

    private abav() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abav();
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
        return abnv.L(abav.class);
    }
}
