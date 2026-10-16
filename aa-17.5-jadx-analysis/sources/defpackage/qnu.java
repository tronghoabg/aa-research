package defpackage;

/* loaded from: classes2.dex */
public final class qnu extends abnv implements abox {
    public static final qnu a;
    public int b = 0;
    public Object c;

    static {
        qnu qnuVar = new qnu();
        a = qnuVar;
        abnv.P(qnu.class, qnuVar);
    }

    private qnu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002Ȼ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new qnu();
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
        return abnv.L(qnu.class);
    }
}
