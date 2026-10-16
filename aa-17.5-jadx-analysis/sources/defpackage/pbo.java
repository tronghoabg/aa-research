package defpackage;

/* loaded from: classes2.dex */
public final class pbo extends abnv implements abox {
    public static final pbo a;
    public int b;
    public String c = "";
    public int d;

    static {
        pbo pboVar = new pbo();
        a = pboVar;
        abnv.P(pbo.class, pboVar);
    }

    private pbo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new pbo();
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
        return abnv.L(pbo.class);
    }
}
