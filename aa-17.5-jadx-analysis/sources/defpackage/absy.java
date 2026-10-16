package defpackage;

/* loaded from: classes3.dex */
public final class absy extends abnv implements abox {
    public static final absy a;
    private int b;
    private ablg c;
    private acgb d;

    static {
        absy absyVar = new absy();
        a = absyVar;
        abnv.P(absy.class, absyVar);
    }

    private absy() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0006\b\u0002\u0000\u0000\u0000\u0006ဉ\u0002\bဉ\u0001", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new absy();
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
        return abnv.L(absy.class);
    }
}
