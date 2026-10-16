package defpackage;

/* loaded from: classes3.dex */
public final class szm extends abnv implements abox {
    public static final szm a;
    public int b;
    public boolean c;
    public tak d;
    public tbc e;
    public boolean f;

    static {
        szm szmVar = new szm();
        a = szmVar;
        abnv.P(szm.class, szmVar);
    }

    private szm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new szm();
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
        return abnv.L(szm.class);
    }
}
