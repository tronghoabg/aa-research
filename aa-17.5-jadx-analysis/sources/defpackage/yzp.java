package defpackage;

/* loaded from: classes3.dex */
public final class yzp extends abnv implements abox {
    public static final yzp a;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        yzp yzpVar = new yzp();
        a = yzpVar;
        abnv.P(yzp.class, yzpVar);
    }

    private yzp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yzp();
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
        return abnv.L(yzp.class);
    }
}
