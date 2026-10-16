package defpackage;

/* loaded from: classes.dex */
public final class wcx extends abnv implements abox {
    public static final wcx a;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int h;

    static {
        wcx wcxVar = new wcx();
        a = wcxVar;
        abnv.P(wcx.class, wcxVar);
    }

    private wcx() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", "b", "c", "d", xln.k, "e", "g", "f"});
        }
        if (i2 == 3) {
            return new wcx();
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
        return abnv.L(wcx.class);
    }
}
