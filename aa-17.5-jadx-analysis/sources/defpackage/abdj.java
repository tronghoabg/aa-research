package defpackage;

/* loaded from: classes3.dex */
public final class abdj extends abnv implements abox {
    public static final abdj a;
    public static final abnh b;

    static {
        abdj abdjVar = new abdj();
        a = abdjVar;
        abnv.P(abdj.class, abdjVar);
        b = abnv.W(abuf.a, abdjVar, abdjVar, null, 525006022, abqd.MESSAGE);
    }

    private abdj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abdj();
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
        return abnv.L(abdj.class);
    }
}
