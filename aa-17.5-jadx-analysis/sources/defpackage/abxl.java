package defpackage;

/* loaded from: classes3.dex */
public final class abxl extends abnv implements abox {
    public static final abxl a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public abxn g;

    static {
        abxl abxlVar = new abxl();
        a = abxlVar;
        abnv.P(abxl.class, abxlVar);
    }

    private abxl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abxl();
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
        return abnv.L(abxl.class);
    }
}
