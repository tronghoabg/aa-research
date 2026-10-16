package defpackage;

/* loaded from: classes3.dex */
public final class znm extends abnv implements abox {
    public static final znm a;
    public int b;
    private int c;

    static {
        znm znmVar = new znm();
        a = znmVar;
        abnv.P(znm.class, znmVar);
    }

    private znm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", zli.a});
        }
        if (i2 == 3) {
            return new znm();
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
        return abnv.L(znm.class);
    }
}
