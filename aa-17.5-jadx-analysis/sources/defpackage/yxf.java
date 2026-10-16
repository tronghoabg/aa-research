package defpackage;

/* loaded from: classes.dex */
public final class yxf extends abnv implements abox {
    public static final yxf a;
    public int b;
    public int d;
    public int f;
    public int g;
    public String c = "";
    public String e = "";
    public aboh h = abpf.b;

    static {
        yxf yxfVar = new yxf();
        a = yxfVar;
        abnv.P(yxf.class, yxfVar);
    }

    private yxf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005င\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", yxg.class});
        }
        if (i2 == 3) {
            return new yxf();
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
        return abnv.L(yxf.class);
    }
}
