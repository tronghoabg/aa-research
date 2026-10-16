package defpackage;

/* loaded from: classes3.dex */
public final class uyd extends abnv implements abox {
    public static final uyd a;
    public int b;
    public int c = 2;
    public int d = 2;

    static {
        uyd uydVar = new uyd();
        a = uydVar;
        abnv.P(uyd.class, uydVar);
    }

    private uyd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new uyd();
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
        return abnv.L(uyd.class);
    }
}
