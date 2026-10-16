package defpackage;

/* loaded from: classes3.dex */
public final class vus extends abnv implements abox {
    public static final vus a;
    public int b;
    public String c = "";
    private int d;

    static {
        vus vusVar = new vus();
        a = vusVar;
        abnv.P(vus.class, vusVar);
    }

    private vus() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"d", "b", tap.i, "c"});
        }
        if (i2 == 3) {
            return new vus();
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
        return abnv.L(vus.class);
    }
}
