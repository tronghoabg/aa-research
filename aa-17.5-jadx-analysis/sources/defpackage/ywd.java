package defpackage;

/* loaded from: classes3.dex */
public final class ywd extends abnv implements abox {
    public static final ywd a;
    private abot b = abot.a;

    static {
        ywd ywdVar = new ywd();
        a = ywdVar;
        abnv.P(ywd.class, ywdVar);
    }

    private ywd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", new lds(abqdVar, 0, abqdVar, 0)});
        }
        if (i2 == 3) {
            return new ywd();
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
        return abnv.L(ywd.class);
    }
}
