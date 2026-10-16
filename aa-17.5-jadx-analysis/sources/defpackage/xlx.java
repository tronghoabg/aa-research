package defpackage;

/* loaded from: classes3.dex */
public final class xlx extends abnv implements abox {
    public static final xlx a;
    public int b;
    public float c;

    static {
        xlx xlxVar = new xlx();
        a = xlxVar;
        abnv.P(xlx.class, xlxVar);
    }

    private xlx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xlx();
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
        return abnv.L(xlx.class);
    }
}
