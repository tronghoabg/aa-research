package defpackage;

/* loaded from: classes3.dex */
public final class zap extends abnv implements abox {
    public static final zap a;
    private int b;
    private zam c;
    private abot d = abot.a;
    private zao e;
    private zan f;

    static {
        zap zapVar = new zap();
        a = zapVar;
        abnv.P(zap.class, zapVar);
    }

    private zap() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00062\u0007ဉ\u0002", new Object[]{"b", "c", "e", "d", new lds(abqd.INT32, 0, abqd.MESSAGE, zam.a), "f"});
        }
        if (i2 == 3) {
            return new zap();
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
        return abnv.L(zap.class);
    }
}
