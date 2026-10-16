package defpackage;

/* loaded from: classes2.dex */
public final class qnv extends abnv implements abox {
    public static final qnv a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public aboh f = abpf.b;

    static {
        qnv qnvVar = new qnv();
        a = qnvVar;
        abnv.P(qnv.class, qnvVar);
    }

    private qnv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", qnr.class});
        }
        if (i2 == 3) {
            return new qnv();
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
        return abnv.L(qnv.class);
    }
}
