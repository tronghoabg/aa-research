package defpackage;

/* loaded from: classes3.dex */
public final class vtg extends abnv implements abox {
    public static final vtg a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    private int f;

    static {
        vtg vtgVar = new vtg();
        a = vtgVar;
        abnv.P(vtg.class, vtgVar);
    }

    private vtg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new vtg();
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
        return abnv.L(vtg.class);
    }
}
