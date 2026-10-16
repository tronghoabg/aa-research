package defpackage;

/* loaded from: classes.dex */
public final class xmg extends abnv implements abox {
    public static final xmg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        xmg xmgVar = new xmg();
        a = xmgVar;
        abnv.P(xmg.class, xmgVar);
    }

    private xmg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xmg();
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
        return abnv.L(xmg.class);
    }
}
