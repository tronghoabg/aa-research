package defpackage;

/* loaded from: classes3.dex */
public final class aawr extends abnv implements abox {
    public static final aawr a;
    public int b = 10;
    public int c = 1800;
    public int d = 200;
    public int e = 7;
    public boolean f;
    private int g;

    static {
        aawr aawrVar = new aawr();
        a = aawrVar;
        abnv.P(aawr.class, aawrVar);
    }

    private aawr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aawr();
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
        return abnv.L(aawr.class);
    }
}
