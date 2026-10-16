package defpackage;

/* loaded from: classes3.dex */
public final class abcm extends abnv implements abox {
    public static final abcm a;
    public static final abnh b;

    static {
        abcm abcmVar = new abcm();
        a = abcmVar;
        abnv.P(abcm.class, abcmVar);
        b = abnv.W(abuf.a, abcmVar, abcmVar, null, 525006548, abqd.MESSAGE);
    }

    private abcm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abcm();
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
        return abnv.L(abcm.class);
    }
}
