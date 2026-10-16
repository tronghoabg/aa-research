package defpackage;

/* loaded from: classes2.dex */
public final class qny extends abnv implements abox {
    public static final qny a;

    static {
        qny qnyVar = new qny();
        a = qnyVar;
        abnv.P(qny.class, qnyVar);
    }

    private qny() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new qny();
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
        return abnv.L(qny.class);
    }
}
