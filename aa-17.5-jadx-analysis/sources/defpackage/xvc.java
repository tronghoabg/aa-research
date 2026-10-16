package defpackage;

/* loaded from: classes3.dex */
public final class xvc extends abnv implements abox {
    public static final xvc a;
    private abot b = abot.a;

    static {
        xvc xvcVar = new xvc();
        a = xvcVar;
        abnv.P(xvc.class, xvcVar);
    }

    private xvc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new lds(abqd.INT64, 0L, abqd.INT32, 0)});
        }
        if (i2 == 3) {
            return new xvc();
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
        return abnv.L(xvc.class);
    }
}
