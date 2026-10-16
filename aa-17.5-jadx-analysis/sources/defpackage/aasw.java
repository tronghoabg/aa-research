package defpackage;

/* loaded from: classes3.dex */
public final class aasw extends abnv implements abox {
    public static final aasw a;
    private abot b = abot.a;

    static {
        aasw aaswVar = new aasw();
        a = aaswVar;
        abnv.P(aasw.class, aaswVar);
    }

    private aasw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", new lds(abqdVar, 0, abqdVar, 0)});
        }
        if (i2 == 3) {
            return new aasw();
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
        return abnv.L(aasw.class);
    }
}
