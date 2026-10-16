package defpackage;

/* loaded from: classes2.dex */
public final class qcl extends abnv implements abox {
    public static final qcl a;
    public aboh b = abpf.b;

    static {
        qcl qclVar = new qcl();
        a = qclVar;
        abnv.P(qcl.class, qclVar);
    }

    private qcl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", qcm.class});
        }
        if (i2 == 3) {
            return new qcl();
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
        return abnv.L(qcl.class);
    }
}
