package defpackage;

/* loaded from: classes3.dex */
public final class xlg extends abnv implements abox {
    public static final xlg a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        xlg xlgVar = new xlg();
        a = xlgVar;
        abnv.P(xlg.class, xlgVar);
    }

    private xlg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", xku.f, "d", "e"});
        }
        if (i2 == 3) {
            return new xlg();
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
        return abnv.L(xlg.class);
    }
}
