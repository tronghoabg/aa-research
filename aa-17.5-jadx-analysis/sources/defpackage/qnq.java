package defpackage;

/* loaded from: classes2.dex */
public final class qnq extends abnv implements abox {
    public static final qnq a;
    public int b;
    public aboh c = abpf.b;

    static {
        qnq qnqVar = new qnq();
        a = qnqVar;
        abnv.P(qnq.class, qnqVar);
    }

    private qnq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new qnq();
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
        return abnv.L(qnq.class);
    }
}
