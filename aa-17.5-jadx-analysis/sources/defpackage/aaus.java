package defpackage;

/* loaded from: classes3.dex */
public final class aaus extends abnv implements abox {
    public static final aaus a;
    public String b = "";
    private int c;

    static {
        aaus aausVar = new aaus();
        a = aausVar;
        abnv.P(aaus.class, aausVar);
    }

    private aaus() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aaus();
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
        return abnv.L(aaus.class);
    }
}
