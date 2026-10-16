package defpackage;

/* loaded from: classes3.dex */
public final class zbk extends abnv implements abox {
    public static final zbk a;
    private int b;
    private zbj c;
    private abot d = abot.a;

    static {
        zbk zbkVar = new zbk();
        a = zbkVar;
        abnv.P(zbk.class, zbkVar);
    }

    private zbk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0011\u0002\u0001\u0000\u0000\u0003ဉ\u0002\u00112", new Object[]{"b", "c", "d", new lds(abqdVar, 0, abqdVar, 0)});
        }
        if (i2 == 3) {
            return new zbk();
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
        return abnv.L(zbk.class);
    }
}
