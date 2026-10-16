package defpackage;

/* loaded from: classes2.dex */
public final class qns extends abnv implements abox {
    public static final qns a;

    static {
        qns qnsVar = new qns();
        a = qnsVar;
        abnv.P(qns.class, qnsVar);
    }

    private qns() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new qns();
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
        return abnv.L(qns.class);
    }
}
