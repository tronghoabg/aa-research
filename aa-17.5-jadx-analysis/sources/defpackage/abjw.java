package defpackage;

/* loaded from: classes3.dex */
public final class abjw extends abnv implements abox {
    public static final abjw a;
    public int b;
    public String c = "";

    static {
        abjw abjwVar = new abjw();
        a = abjwVar;
        abnv.P(abjw.class, abjwVar);
    }

    private abjw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abjw();
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
        return abnv.L(abjw.class);
    }
}
