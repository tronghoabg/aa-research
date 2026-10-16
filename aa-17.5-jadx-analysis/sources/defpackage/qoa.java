package defpackage;

/* loaded from: classes2.dex */
public final class qoa extends abnv implements abox {
    public static final qoa a;
    public int b;
    public qnz c;
    public String d = "";
    private int e;

    static {
        qoa qoaVar = new qoa();
        a = qoaVar;
        abnv.P(qoa.class, qoaVar);
    }

    private qoa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004Ȉ", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new qoa();
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
        return abnv.L(qoa.class);
    }
}
