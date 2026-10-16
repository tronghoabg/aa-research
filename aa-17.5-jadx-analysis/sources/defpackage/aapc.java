package defpackage;

/* loaded from: classes3.dex */
public final class aapc extends abnv implements abox {
    public static final aapc a;
    private int b;
    private znw c;

    static {
        aapc aapcVar = new aapc();
        a = aapcVar;
        abnv.P(aapc.class, aapcVar);
    }

    private aapc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aapc();
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
        return abnv.L(aapc.class);
    }
}
