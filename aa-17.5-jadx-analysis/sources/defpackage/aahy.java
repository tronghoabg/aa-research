package defpackage;

/* loaded from: classes3.dex */
public final class aahy extends abnv implements abox {
    public static final aahy a;
    public int b;
    public int c;
    public int d;

    static {
        aahy aahyVar = new aahy();
        a = aahyVar;
        abnv.P(aahy.class, aahyVar);
    }

    private aahy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aahy();
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
        return abnv.L(aahy.class);
    }
}
