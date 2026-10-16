package defpackage;

/* loaded from: classes3.dex */
public final class abiu extends abnv implements abox {
    public static final abiu a;
    public aboh b = abpf.b;

    static {
        abiu abiuVar = new abiu();
        a = abiuVar;
        abnv.P(abiu.class, abiuVar);
    }

    private abiu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abit.class});
        }
        if (i2 == 3) {
            return new abiu();
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
        return abnv.L(abiu.class);
    }
}
