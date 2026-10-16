package defpackage;

/* loaded from: classes3.dex */
public final class acap extends abnv implements abox {
    public static final acap a;
    public Object c;
    public int b = 0;
    public aboh d = abpf.b;

    static {
        acap acapVar = new acap();
        a = acapVar;
        abnv.P(acap.class, acapVar);
    }

    private acap() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", acao.class});
        }
        if (i2 == 3) {
            return new acap();
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
        return abnv.L(acap.class);
    }
}
