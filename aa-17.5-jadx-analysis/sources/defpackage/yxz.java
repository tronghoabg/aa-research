package defpackage;

/* loaded from: classes3.dex */
public final class yxz extends abnv implements abox {
    public static final yxz a;
    public int b;
    public String c = "";

    static {
        yxz yxzVar = new yxz();
        a = yxzVar;
        abnv.P(yxz.class, yxzVar);
    }

    private yxz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new yxz();
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
        return abnv.L(yxz.class);
    }
}
