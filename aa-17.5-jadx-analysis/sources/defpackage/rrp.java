package defpackage;

/* loaded from: classes2.dex */
public final class rrp extends abnv implements abox {
    public static final rrp a;
    public int b;
    public int c;
    public int d;

    static {
        rrp rrpVar = new rrp();
        a = rrpVar;
        abnv.P(rrp.class, rrpVar);
    }

    private rrp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new rrp();
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
        return abnv.L(rrp.class);
    }
}
