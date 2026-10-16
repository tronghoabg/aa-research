package defpackage;

/* loaded from: classes3.dex */
public final class abwi extends abnv implements abox {
    public static final abwi a;
    public int b;

    static {
        abwi abwiVar = new abwi();
        a = abwiVar;
        abnv.P(abwi.class, abwiVar);
    }

    private abwi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abwi();
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
        return abnv.L(abwi.class);
    }
}
