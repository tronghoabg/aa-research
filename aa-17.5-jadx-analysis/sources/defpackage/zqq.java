package defpackage;

/* loaded from: classes3.dex */
public final class zqq extends abnv implements abox {
    public static final zqq a;
    public int b;
    public zqp c;

    static {
        zqq zqqVar = new zqq();
        a = zqqVar;
        abnv.P(zqq.class, zqqVar);
    }

    private zqq() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0006", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zqq();
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
        return abnv.L(zqq.class);
    }
}
