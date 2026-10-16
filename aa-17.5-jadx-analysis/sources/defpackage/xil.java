package defpackage;

/* loaded from: classes3.dex */
public final class xil extends abnv implements abox {
    public static final aboe a = new wbk(8);
    public static final xil b;
    public int c;
    public int f;
    public int d = 1;
    public String e = "";
    public abod g = abnw.a;

    static {
        xil xilVar = new xil();
        b = xilVar;
        abnv.P(xil.class, xilVar);
    }

    private xil() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(b, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ࠞ", new Object[]{"c", "d", tap.q, "e", "f", "g", tap.p});
        }
        if (i2 == 3) {
            return new xil();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(xil.class);
    }
}
