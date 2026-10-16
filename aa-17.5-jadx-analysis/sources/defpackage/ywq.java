package defpackage;

/* loaded from: classes.dex */
public final class ywq extends abnv implements abox {
    public static final ywq a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        ywq ywqVar = new ywq();
        a = ywqVar;
        abnv.P(ywq.class, ywqVar);
    }

    private ywq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ywq();
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
        return abnv.L(ywq.class);
    }
}
