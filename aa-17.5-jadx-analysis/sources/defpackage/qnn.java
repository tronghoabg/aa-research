package defpackage;

/* loaded from: classes2.dex */
public final class qnn extends abnv implements abox {
    public static final qnn a;
    public aboh b = abpf.b;
    public boolean c;

    static {
        qnn qnnVar = new qnn();
        a = qnnVar;
        abnv.P(qnn.class, qnnVar);
    }

    private qnn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0007", new Object[]{"b", qnm.class, "c"});
        }
        if (i2 == 3) {
            return new qnn();
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
        return abnv.L(qnn.class);
    }
}
