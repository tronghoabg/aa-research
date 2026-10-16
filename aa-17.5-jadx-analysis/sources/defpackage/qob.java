package defpackage;

/* loaded from: classes2.dex */
public final class qob extends abnv implements abox {
    public static final qob a;
    public aboh b = abpf.b;

    static {
        qob qobVar = new qob();
        a = qobVar;
        abnv.P(qob.class, qobVar);
    }

    private qob() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", qoa.class});
        }
        if (i2 == 3) {
            return new qob();
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
        return abnv.L(qob.class);
    }
}
