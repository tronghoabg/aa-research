package defpackage;

/* loaded from: classes.dex */
public final class xiv extends abnv implements abox {
    public static final xiv a;
    public int b;
    public xmg c;

    static {
        xiv xivVar = new xiv();
        a = xivVar;
        abnv.P(xiv.class, xivVar);
    }

    private xiv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xiv();
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
        return abnv.L(xiv.class);
    }
}
