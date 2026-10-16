package defpackage;

/* loaded from: classes3.dex */
public final class ujq extends abnv implements abox {
    public static final ujq a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        ujq ujqVar = new ujq();
        a = ujqVar;
        abnv.P(ujq.class, ujqVar);
    }

    private ujq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", abce.r, "g"});
        }
        if (i2 == 3) {
            return new ujq();
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
        return abnv.L(ujq.class);
    }
}
