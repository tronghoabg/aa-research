package defpackage;

/* loaded from: classes3.dex */
public final class aaxd extends abnv implements abox {
    public static final aaxd a;

    static {
        aaxd aaxdVar = new aaxd();
        a = aaxdVar;
        abnv.P(aaxd.class, aaxdVar);
    }

    private aaxd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aaxd();
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
        return abnv.L(aaxd.class);
    }
}
