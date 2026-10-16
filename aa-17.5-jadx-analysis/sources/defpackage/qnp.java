package defpackage;

/* loaded from: classes2.dex */
public final class qnp extends abnv implements abox {
    public static final qnp a;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int h;
    public String c = "";
    public aboh e = abpf.b;

    static {
        qnp qnpVar = new qnp();
        a = qnpVar;
        abnv.P(qnp.class, qnpVar);
    }

    private qnp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"h", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new qnp();
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
        return abnv.L(qnp.class);
    }
}
