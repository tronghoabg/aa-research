package defpackage;

/* loaded from: classes3.dex */
public final class vsx extends abnv implements abox {
    public static final vsx a;
    public int b;
    public int c;

    static {
        vsx vsxVar = new vsx();
        a = vsxVar;
        abnv.P(vsx.class, vsxVar);
    }

    private vsx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new vsx();
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
        return abnv.L(vsx.class);
    }
}
