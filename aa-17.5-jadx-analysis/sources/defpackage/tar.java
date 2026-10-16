package defpackage;

/* loaded from: classes3.dex */
public final class tar extends abnv implements abox {
    public static final tar a;
    public aboh b = abpf.b;

    static {
        tar tarVar = new tar();
        a = tarVar;
        abnv.P(tar.class, tarVar);
    }

    private tar() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", tao.class});
        }
        if (i2 == 3) {
            return new tar();
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
        return abnv.L(tar.class);
    }
}
