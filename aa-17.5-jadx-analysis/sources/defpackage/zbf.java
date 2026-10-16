package defpackage;

/* loaded from: classes3.dex */
public final class zbf extends abnv implements abox {
    public static final zbf a;
    public int b;
    public long c;
    public boolean d;
    private int e;

    static {
        zbf zbfVar = new zbf();
        a = zbfVar;
        abnv.P(zbf.class, zbfVar);
    }

    private zbf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new zbf();
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
        return abnv.L(zbf.class);
    }
}
