package defpackage;

/* loaded from: classes3.dex */
public final class abef extends abnv implements abox {
    public static final abef a;
    public aboc b = abnn.a;
    public int c = -1;
    public boolean d;
    private int e;

    static {
        abef abefVar = new abef();
        a = abefVar;
        abnv.P(abef.class, abefVar);
    }

    private abef() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0000\u0003ဇ\u0001\u0004$", new Object[]{"e", "c", "d", "b"});
        }
        if (i2 == 3) {
            return new abef();
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
        return abnv.L(abef.class);
    }
}
