package defpackage;

/* loaded from: classes3.dex */
public final class absm extends abnv implements abox {
    public static final absm a;
    public int b;
    public String c = "";
    public int d;

    static {
        absm absmVar = new absm();
        a = absmVar;
        abnv.P(absm.class, absmVar);
    }

    private absm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new absm();
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
        return abnv.L(absm.class);
    }
}
