package defpackage;

/* loaded from: classes3.dex */
public final class aazu extends abnv implements abox {
    public static final aazu a;
    public aboh b = abpf.b;

    static {
        aazu aazuVar = new aazu();
        a = aazuVar;
        abnv.P(aazu.class, aazuVar);
    }

    private aazu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", aazt.class});
        }
        if (i2 == 3) {
            return new aazu();
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
        return abnv.L(aazu.class);
    }
}
