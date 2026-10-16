package defpackage;

/* loaded from: classes3.dex */
public final class acbf extends abnv implements abox {
    public static final acbf a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";

    static {
        acbf acbfVar = new acbf();
        a = acbfVar;
        abnv.P(acbf.class, acbfVar);
    }

    private acbf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", absk.h, "d", "e"});
        }
        if (i2 == 3) {
            return new acbf();
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
        return abnv.L(acbf.class);
    }
}
