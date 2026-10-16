package defpackage;

/* loaded from: classes3.dex */
public final class abcj extends abnv implements abox {
    public static final abcj a;

    static {
        abcj abcjVar = new abcj();
        a = abcjVar;
        abnv.P(abcj.class, abcjVar);
    }

    private abcj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abcj();
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
        return abnv.L(abcj.class);
    }
}
