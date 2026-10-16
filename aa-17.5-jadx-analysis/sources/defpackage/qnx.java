package defpackage;

/* loaded from: classes2.dex */
public final class qnx extends abnv implements abox {
    public static final qnx a;
    public int b;
    public String c = "";
    public String d = "";
    public aboh e;
    public aboh f;
    public boolean g;

    static {
        qnx qnxVar = new qnx();
        a = qnxVar;
        abnv.P(qnx.class, qnxVar);
    }

    private qnx() {
        abpf abpfVar = abpf.b;
        this.e = abpfVar;
        this.f = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", qnr.class, "g"});
        }
        if (i2 == 3) {
            return new qnx();
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
        return abnv.L(qnx.class);
    }
}
